package com.example.helloworld.mycreditcard;

public class CreditCard {
    int accountNumber;
    int currentBalance;

    public CreditCard(int accountNumber, int currentSum) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentSum;
    }

    public void plus(int sum) {
        currentBalance += sum;
    }

    public void minus(double minus) {
        if (currentBalance >= minus && minus != 0) {
            currentBalance -= minus;
        } else {
            System.out.println("You don't have enough money");
        }
    }

    void printInfo() {
        System.out.println("Account Number: " + accountNumber + " | " + " Current Balance: " + currentBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}