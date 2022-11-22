package com.example.helloworld.mycreditcard;

public class CreditCard {
    int accountNumber;
    int currentBalance;

    public CreditCard(int accountNumber, int currentSum) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentSum;
    }
    int plus(int sum){
        return currentBalance += sum;
    }
    int minus(int minus){
        if(minus > currentBalance){
            minus = 0;
            System.out.println("You don't have enough funds");
        }
        return currentBalance -= minus;
    }

    void printInfo(){
        System.out.println("Account Number: " + accountNumber +  " | "  +  " Current Balance: " + currentBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}