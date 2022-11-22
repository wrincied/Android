package com.example.helloworld.mycreditcard;

import java.util.Scanner;

public class MyCreditApp {
    public static void main(String[] args) {
        CreditCard creditCardOne = new CreditCard(1251,458);
        CreditCard creditCardTwo = new CreditCard(1252,0);
        CreditCard creditCardThree = new CreditCard(1253, 8858);

        creditCardOne.printInfo();
        creditCardTwo.printInfo();
        creditCardThree.printInfo();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount to deposit into the account: " + creditCardOne.getAccountNumber());
        int sumOne = in.nextInt();
        System.out.println("Enter the amount to deposit into the account: "  + creditCardTwo.getAccountNumber());
        int sumTwo = in.nextInt();
        System.out.println("Enter the amount to withdraw from the account: " + creditCardThree.getAccountNumber());
        int sumThree = in.nextInt();

        creditCardOne.plus(sumOne);
        creditCardTwo.plus(sumTwo);
        creditCardThree.minus(sumThree);

        creditCardOne.printInfo();
        creditCardTwo.printInfo();
        creditCardThree.printInfo();
    }
}
