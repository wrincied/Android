package com.example.helloworld;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        task1();
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
