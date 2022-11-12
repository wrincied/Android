package com.example.helloworld;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        printInConsole(a);
    }

    static void printInConsole(int a) {
//        switch (a){
//            case (1):
//                System.out.println("Один");
//            break;
//            case (2):
//                System.out.println("Два");
//            break;
//            default:
//                System.out.println("Другое число, ни 1, ни 2,");
//                System.out.println("Ваше число:" + a);
//        }
//        for (int i = 0; i<10; i++){
//            System.out.println(i);
//        }

    }
}
//package com.example.helloworld;
//
//        import java.sql.SQLOutput;
//        import java.util.Scanner;
//
//public class Homework {
//    public static void main(String[] args) {
//        task1();
//        task2();
//    }
//
//
//    static void task1() {
//        System.out.println("Введите число: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if (a % 2 == 0) {
//            System.out.println("Число " + a + " является четным");
//        } else {
//            System.out.println("Число " + a + " является нечетным");
//        }
//    }
//
//    static void task2() {
//        System.out.println("Введите 3 числа:");
//        Scanner in = new Scanner(System.in);
//        int firstNumber = in.nextInt();
//        int secondNumber = in.nextInt();
//        int thirdNumber = in.nextInt();
//
//        firstNumber = (firstNumber < 0) ? (-firstNumber) : firstNumber;
//        secondNumber = (secondNumber < 0) ? (-secondNumber) : secondNumber;
//        thirdNumber = (thirdNumber < 0) ? (-thirdNumber) : thirdNumber;
//
//        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
//            System.out.println("Меньшее по модулю число:" + firstNumber);
//        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
//            System.out.println("Меньшее по модулю число:" + secondNumber);
//        } else if (thirdNumber <= firstNumber && thirdNumber <= secondNumber){
//            System.out.println("Меньшее по модулю число:" + thirdNumber);
//        }
//
//    }
//}

