package com.example.helloworld.lesson11.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Messenger {
    private ArrayDeque<User> users = new ArrayDeque<>();
    private User selectedUser = new User();
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    public ArrayDeque<User> getUsers() {
        return users;
    }

    public User getSelectedUser() {
        return selectedUser;
    }


    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public void messengerLogic() {

    }
}
