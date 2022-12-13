package com.example.helloworld.lesson12.homework;


import java.util.HashMap;
import java.util.Scanner;

public class App {
    private final static Scanner SCANNER = new Scanner(System.in);
    static HashMap<String, Pet> animals = new HashMap<>();


    public static void main(String[] args) {
        Pet catOne = new Cat("Whiskers", "Abyssinian Cat", "Male", "Purina");
        Pet catTwo = new Cat("Felix", "Birman Cat", "Male", "Purina");
        Pet dogOne = new Dog("Muhtar", "German shepherd", "Male", "Purina");
        Pet dogTwo = new Dog("Malina", "Pudel", "Female", "Purina");
        Pet horseOne = new Horse("Pegasus", "Adenauer", "Male", "Hay");


        animals.put(catOne.getName(), catOne);
        animals.put(catTwo.getName(), catTwo);
        animals.put(dogOne.getName(), dogOne);
        animals.put(dogTwo.getName(), dogTwo);
        animals.put(horseOne.getName(), horseOne);
        printInfoAboutAllAnimals();

        System.out.print("Enter the name of the animal you want to delete: ");
        removeAnimalByName();
        printInfoAboutAllAnimals();
    }

    private static void printInfoAboutAllAnimals() {
        System.out.println("List of animal");
        for (Pet pet : animals.values()) {
            System.out.print('\n');
            pet.printInfoAboutAnimal();
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
}
