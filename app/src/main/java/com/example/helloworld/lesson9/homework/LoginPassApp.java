package com.example.helloworld.lesson9.homework;

import java.util.Scanner;

public class LoginPassApp {
    private static final String INPUT_DATA = "[A-Za-z\\d_]{1,20}";

    public static void main(String[] args) {
        registration();
    }

    public static void registration() {
        while (true) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter your Login: ");
            String login = in.nextLine();
            System.out.println("Enter your Password: ");
            String password = in.nextLine();
            System.out.println("Confirm your Password: ");
            String confirmPass = in.nextLine();
            try {
                if (checkLoginAndPassword(login, password, confirmPass)) {
                    System.out.println("Correct Username and Password");
                }
                break;
            } catch (WrongLoginException e) {
                System.err.println(e.getMessage());
            } catch (WrongPasswordException c) {
                System.err.println(c.getMessage());
            }
            System.err.println("Repeat data entry");
        }
    }

    private static boolean checkLoginAndPassword(String login, String password, String confirmPass) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(INPUT_DATA)) {
            throw new WrongLoginException("The length of login must be less than 20 characters.");
        } else if (!password.matches(INPUT_DATA) || !password.equals(confirmPass)) {
            throw new WrongPasswordException("Password must contain only latin letters, numbers and underscores." + "The password length must be less than 20 characters.");
        } else {
            return true;
        }
    }
}

