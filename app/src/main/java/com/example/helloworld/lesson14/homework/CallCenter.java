package com.example.helloworld.lesson14.homework;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {
    private static int callNumberCheck;
    private static final int AMOUNT_OF_CALLS = 8;

    public static void main(String[] args) {
        List<acceptCall> acceptCallList = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_CALLS; i++) {
            acceptCallList.add(new acceptCall());
        }
        
        Runnable myRunnable = () -> {
            for (int callNumber = 0; callNumber < AMOUNT_OF_CALLS; callNumber++) {
                acceptCallList.add(new acceptCall());
                synchronized (acceptCallList) {
                    if (callNumber == callNumberCheck) {
                        acceptCallList.get(callNumber).printInfoAboutCall(Thread.currentThread().getName());
                        callNumberCheck++;
                        try {
                            Thread.sleep(2000);
                        } catch (Exception e) {
                            System.out.println("Error");
                        }
                    }
                }
            }
        };
        
        Thread workerThreadOne = new Thread(myRunnable);
        Thread workerThreadTwo = new Thread(myRunnable);
        Thread workerThreadThree = new Thread(myRunnable);

        workerThreadOne.setName("Sofia");
        workerThreadTwo.setName("Jessica");
        workerThreadThree.setName("Anna");

        workerThreadOne.start();
        workerThreadTwo.start();
        workerThreadThree.start();
    }
}
