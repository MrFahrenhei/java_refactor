package br.com.alura.domain;

public class Shelter {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private Pet[] pets;

    public Shelter(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    public Shelter(){}

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return phone;
    }

    public Pet[] getPets() {
        return pets;
    }

    public String getEmail() {
        return email;
    }
}
