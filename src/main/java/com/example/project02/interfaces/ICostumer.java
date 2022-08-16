package com.example.project02.interfaces;

import com.example.project02.actors.Costumers;
import javafx.collections.ObservableList;

public interface ICostumer {
    void insertCostumer(Costumers costumer);

    void updateCostumer(Costumers costumer);

    boolean deleteCostumer(int costumerId);

    Costumers getCostumer(Costumers costumer);

    ObservableList<Costumers> getAllCostumers();
}
