package com.example.helloworld;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    static void task4() {
        for (int i = 0; i <= 100; i+=5){
            if(i == 0) continue;
            System.out.println(i);
        }
    }

    static void task3() {
        System.out.println("Введите число от 1 до 7");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        switch (number){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четрвег");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неизвестный день недели");
        }


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

