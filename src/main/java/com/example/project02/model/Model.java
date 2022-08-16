package com.example.project02.model;

import com.example.project02.actors.Costumers;
import com.example.project02.actors.Users;
import com.example.project02.dao.CostumerDAO;
import com.example.project02.dao.UserDAO;
import com.example.project02.dao.servicedeo.LoanDAO;
import com.example.project02.services.Loan;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {
    private CostumerDAO costumerDAO;
    private UserDAO userDAO;
    private LoanDAO loanDAO;

    private ObservableList<Costumers> costumers;
    private ObservableList<Users> users;
    private ObservableList<Costumers> activeCostumers;
    private ObservableList<Costumers> outdatedCostumers;

    public Model() {
        this.costumerDAO = new CostumerDAO();
        this.userDAO = new UserDAO();
        this.loanDAO = new LoanDAO();
        this.costumers = FXCollections.observableArrayList(costumerDAO.getAllCostumers());
        this.users = FXCollections.observableArrayList(userDAO.getAllUsers());
        this.activeCostumers = FXCollections.observableArrayList();
        this.outdatedCostumers = FXCollections.emptyObservableList();
//        activeCostumers.addAll(costumers.get(0), costumers.get(1));
//        outdatedCostumers.addAll(costumers.get(2));
    }

    public CostumerDAO getCostumerDAO() {
        return costumerDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public LoanDAO getLoanDAO() {
        return loanDAO;
    }

    public ObservableList<Costumers> getCostumers() {
        return costumers;
    }


}
