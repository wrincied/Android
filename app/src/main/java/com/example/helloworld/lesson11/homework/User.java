package com.example.helloworld.lesson11.homework;

import java.util.ArrayDeque;

public class User {
    private String userName;
    private ArrayDeque<String> messages = new ArrayDeque<>();

    public String getUserName() {
        return userName;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public ArrayDeque<String> getMessages() {
        return messages;
    }

    public int getCountMessages() {
        return getMessages().size();
    }

    public void writeMessage(String messages, User user) {
        user.getMessages().addLast(messages + "name:" + getUserName());
        System.out.println("The message was successful sent");
    }

    public void readMessage() {
        if (getMessages().peekFirst() != null) {
            String message = getMessages().peekFirst().replaceAll(";name:" + ".*", "");
            String name = getMessages().pollFirst().replaceAll(".*" + ";name:", "");
            System.out.println("Message from " + name + " : " + message);
        }
    }


    public User() {

    }
}
