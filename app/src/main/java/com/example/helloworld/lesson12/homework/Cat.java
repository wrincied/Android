package com.example.helloworld.lesson12.homework;

import java.util.Objects;

public class Cat extends Pet {
    private String catFood;

    public Cat(String name, String breed, String gender, String catFood) {
        super(name, breed, gender);
        this.catFood = catFood;
    }

    public String getCatFood() {
        return catFood;
    }

    @Override
    public void printInfoAboutPet() {
        System.out.println("Cat name: " + getName() + "Cat breed: " + getBreed() + "Cat food: " + getCatFood() + "Cat gender" + getGender());
    }
}
