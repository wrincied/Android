package com.example.helloworld;

import java.util.Arrays;

public class HomeworkArrays {
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        String[] names = {"Roma", "Jan", "John", "Liza"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}

