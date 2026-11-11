package br.com.alura.service;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.domain.Shelter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.http.HttpResponse;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ShelterServiceTest {
    private ClientHttpConfiguration client = mock(ClientHttpConfiguration.class);
    private ShelterService shelterService = new ShelterService(client);
    private HttpResponse<String> response = mock(HttpResponse.class);
    private Shelter shelter = new Shelter("Test", "45112345678", "abrigo@email.com");
    @Test
    public void shouldCheckIfGetIsUsed() throws IOException, InterruptedException{
        shelter.setId(0L);
        String expectedShelterRegister = "Abrigos cadastrados:";
        String expectedIdAndName = "0 - Test";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        when(response.body()).thenReturn("[{"+shelter.toString()+"}]");
        when(client.useGet(anyString())).thenReturn(response);

        shelterService.listShelter();

        String[] lines = baos.toString().split(System.lineSeparator());
        String actualSheltersRegistered = lines[0];
        String actualIdAndName = lines[1];

        Assertions.assertEquals(expectedShelterRegister, actualSheltersRegistered);
        Assertions.assertEquals(expectedIdAndName, actualIdAndName);
    }
}
