package com.example.helloworld.lesson12.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private final static Scanner SCANNER = new Scanner(System.in);


    public static void main(String[] args) {
        Pet catOne = new Cat("Whiskers", "Abyssinian Cat", "Male", "Purina");
        Pet catTwo = new Cat("Felix", "Birman Cat", "Male", "Purina");
        Pet dogOne = new Dog("Muhtar", "German shepherd", "Male", "Purina");
        Pet dogTwo = new Dog("Malina", "Pudel", "Female", "Purina");
        Pet horseOne = new Horse("Pegasus", "Adenauer", "Male", "Hay");

        putNewAnimal(catOne);
        putNewAnimal(catTwo);
        putNewAnimal(dogOne);
        putNewAnimal(dogTwo);
        putNewAnimal(horseOne);

        printAnimalsInfo();

        System.out.print("Enter the name of the animal you want to delete: ");
        removeAnimalByName();
        printAnimalsInfo();
    }

    static HashMap<String, Pet> animals = new HashMap<>();


    private static void printAnimalsInfo() {
        System.out.println("List of Animals");
        for (Map.Entry<String, Pet> animal : animals.entrySet()) {
            if (animal.getValue() instanceof Cat) {
                System.out.println("Cat name: " + animal.getValue().getName() + "\n" + "  Breed: " + animal.getValue().getBreed() + ";\n" + "  Gender: " + ((Cat) animal.getValue()).getGender() + ";\n" + "  Food: " + ((Cat) animal.getValue()).getCatFood() + ";\n");
            } else if (animal.getValue() instanceof Dog) {
                System.out.println("Dog name: " + animal.getValue().getName() + "\n" + "  Breed: " + animal.getValue().getBreed() + ";\n" + "  Gender: " + ((Dog) animal.getValue()).getGender() + ";\n" + "  Food: " + ((Dog) animal.getValue()).getDogFood() + ";\n");
            } else if (animal.getValue() instanceof Horse) {
                System.out.println("Horse name: " + animal.getValue().getName() + "\n" + "  Breed: " + animal.getValue().getBreed() + ";\n" + "  Gender: " + ((Horse) animal.getValue()).getGender() + ";\n" + "  Food: " + ((Horse) animal.getValue()).getHorseFood() + ";\n");
            }
        }
    }


    private static void removeAnimalByName() {
        while (true) {
            String nameOfAnimalToDelete = SCANNER.nextLine();
            if (animals.containsKey(nameOfAnimalToDelete)) {
                animals.remove(nameOfAnimalToDelete);
                System.out.println("Animal with a name " + "\"" + nameOfAnimalToDelete + "\"" + " deleted successfully.");
                break;
            } else {
                System.out.println("Invalid input. Retry the operation.");
            }
        }
    }

    static void putNewAnimal(Pet pet) {
        animals.put(pet.getName(), pet);
    }
}
