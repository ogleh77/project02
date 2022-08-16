package com.example.project02.interfaces;

import com.example.project02.actors.Users;
import javafx.collections.ObservableList;

public interface IUser {
    void insertUser(Users user);

    void updateUser(Users user);

    boolean deleteUser(int userID);

    Users getUser();

    ObservableList<Users> getAllUsers();
}
