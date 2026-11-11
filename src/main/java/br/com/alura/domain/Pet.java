package br.com.alura.domain;

public class Pet {
    private long id;
    private String type;
    private String name;
    private String race;
    private int age;
    private String color;
    private float weight;
    public Pet(String type, String name, String race, int age, String color, float weight){
        this.type = type;
        this.name = name;
        this.race = race;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }
    public Pet(){}

    public long getId() {
        return this.id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }
}
