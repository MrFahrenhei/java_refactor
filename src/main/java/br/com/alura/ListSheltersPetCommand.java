package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;
import br.com.alura.service.ShelterService;

import java.io.IOException;

public class ListSheltersPetCommand implements Command {
    @Override
    public void execute() {
        try{
            ClientHttpConfiguration client = new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.listSheltrsPet();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
