package com.example.helloworld.lesson12.homework;

import java.util.Objects;

abstract class Pet {
    private String name;
    private String breed;
    private String gender;

    public Pet(String name, String breed, String gender) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    abstract void printInfoAboutAnimal();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name) && Objects.equals(breed, pet.breed) && Objects.equals(gender, pet.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, gender);
    }

    public void printAnimalsInfo() {
    }
}
