package com.example.helloworld.lesson12.homework;

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
    public void printInfoAboutAnimal() {
        System.out.println("Cat name: " + getName() + '\n' + "Cat breed: " + getBreed() + '\n' + "Cat food: " + getCatFood() + '\n' + "Cat gender: " + getGender());
    }
}
