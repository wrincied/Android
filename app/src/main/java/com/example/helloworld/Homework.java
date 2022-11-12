package com.example.helloworld;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
    }

    static void task2() {
        System.out.println("Введите 3 числа:");
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();

        firstNumber = (firstNumber < 0) ? (-firstNumber) : firstNumber;
        secondNumber = (secondNumber < 0) ? (-secondNumber) : secondNumber;
        thirdNumber = (thirdNumber < 0) ? (-thirdNumber) : thirdNumber;

        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            System.out.println("Меньшее по модулю число:" + firstNumber);
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            System.out.println("Меньшее по модулю число:" + secondNumber);
        } else if (thirdNumber <= firstNumber && thirdNumber <= secondNumber){
            System.out.println("Меньшее по модулю число:" + thirdNumber);
        }

    }

    static void task1() {
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число " + a + " является четным");
        } else {
            System.out.println("Число " + a + " является нечетным");
        }
    }
}

