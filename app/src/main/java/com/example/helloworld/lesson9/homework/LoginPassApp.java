package com.example.helloworld.lesson9.homework;

import java.util.Scanner;

public class LoginPassApp {
    private static final String INPUT_DATA = "[A-Za-z\\d_]{1,20}";

    public static void main(String[] args) {
        registration();
    }

    public static void registration() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your Login: ");
            String login = in.nextLine();
            System.out.print("Enter your Password: ");
            String password = in.nextLine();
            try {
                if (checkLoginAndPassword(login, password, "Password_pass_1313")) {
                    System.out.println("Correct Username and  Password");

                }
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }

    private static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(INPUT_DATA)) {
            throw new WrongLoginException("The length of login must be less than 20 characters.");
        } else if (!password.matches(INPUT_DATA) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException(
                    "Password must contain only latin letters, numbers and underscores." +
                            "The password length must be less than 20 characters."
            );
        } else {
            return true;
        }
    }
}

