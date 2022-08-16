package com.example.project02.dao;

import com.example.project02.actors.Users;
import com.example.project02.interfaces.IUser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserDAO implements IUser {
    @Override
    public void insertUser(Users user) {

    }

    @Override
    public void updateUser(Users user) {

    }

    @Override
    public boolean deleteUser(int userID) {
        return false;
    }

    @Override
    public Users getUser() {
        return null;
    }

    @Override
    public ObservableList<Users> getAllUsers() {
        ObservableList<Users> users = FXCollections.observableArrayList();
        Users users1 = new Users(102, "Bashiir", "Ahmed", "456788", "Male",
                "Morning", "Bashka", "1234", "Empty", true);
        Users users2 = new Users(102, "Mohamed", "Yuusuf", "456788", "Male",
                "Morning", "Ogleh", "1122", "Empty", true);
        users.addAll(users1, users2);
        return users;
    }

    public ObservableList<String> getAlUsernames() {
        ObservableList<String> users = FXCollections.observableArrayList();
        Users users1 = new Users(102, "Bashiir", "Ahmed", "456788", "Male",
                "Morning", "Bashka", "1234", "Empty", true);
        Users users2 = new Users(102, "Mohamed", "Yuusuf", "456788", "Male",
                "Morning", "Ogleh", "1122", "Empty", true);
        users.addAll(users1.getFirstName(), users2.getFirstName());
        users.add("other");
        return users;
    }
}
