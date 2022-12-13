package com.example.helloworld.lesson12.homework;

public class Horse extends Pet {
    private String horseFood;

    public Horse(String name, String breed, String gender, String horseFood) {
        super(name, breed, gender);
        this.horseFood = horseFood;

    }

    public String getHorseFood() {
        return horseFood;
    }

    @Override
    public void printInfoAboutAnimal() {
        System.out.println("Horse name: " + getName() + '\n' + "Horse breed: " + getBreed() + '\n' + "Horse food: " + getHorseFood() + '\n' + "Horse gender: " + getGender());
    }
}
