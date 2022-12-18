package com.example.helloworld.lesson13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final List<Integer> randomNumbers = new ArrayList<>();
    private static Consumer<Integer> printNumbersFrom7To17 = number -> {
        if (number % 2 == 0 && number >= 7 && number <= 17) {
            System.out.print(number + " ");
        }
    };

    public static void main(String[] args) {
        listFilledWithRandomNumbers(enterAmountOfNumbers());
        System.out.println("Initial list of numbers: " + randomNumbers);
        List<Integer> listOfNumbers = randomNumbers.stream()
                .distinct()
                .peek(printNumbersFrom7To17)
                .map(number -> number * 2)
                .filter(number -> number > 10)
                .collect(Collectors.toList());
        System.out.println("Double numbers that are > 10: " + listOfNumbers);
        System.out.println("Amount of numbers in stream: " + listOfNumbers.size());
        System.out.println("Arithmetic mean of all numbers:  " + listOfNumbers.stream().collect(Collectors.averagingInt(number -> number)));
    }

    private static int enterAmountOfNumbers() {
        System.out.print("Enter the desired number of random numbers in the collection: ");
        while (true) {
            try {
                return SCANNER.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input. Try again");
                SCANNER.nextLine();
            }
        }
    }

    private static void listFilledWithRandomNumbers(int amountOfNumbers) {
        for (int i = 0; i < amountOfNumbers; i++) {
            randomNumbers.add((int) (Math.random() * 10) + 1);
        }
    }
}
