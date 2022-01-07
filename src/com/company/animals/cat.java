package com.company.animals;

public class cat {

    private int animalID;
    private String name;
    private String species;
    private int age;

    public cat(int animalID, String name, String species, int age) {
        this.animalID = animalID;
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
