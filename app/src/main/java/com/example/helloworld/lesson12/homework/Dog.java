package com.example.helloworld.lesson12.homework;

public class Dog extends Pet {
    private String dogFood;

    public Dog(String name, String breed, String gender, String dogFood) {
        super(name, breed, gender);
        this.dogFood = dogFood;
    }

    public String getDogFood() {
        return dogFood;
    }

    @Override
    public void printInfoAboutPet() {
        System.out.println("Dog name: " + getName() + "Dog breed: " + getBreed() + "Dog food: " + getDogFood() + "Dog gender: " + getGender());
    }
}
