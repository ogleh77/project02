package com.example.project02.dao;

import com.example.project02.actors.Costumers;
import com.example.project02.interfaces.ICostumer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CostumerDAO implements ICostumer {
    @Override
    public void insertCostumer(Costumers costumer) {
        System.out.println("Inserted..");
        System.out.println(costumer);
    }

    @Override
    public void updateCostumer(Costumers costumer) {
        System.out.println("Updated..");
        System.out.println(costumer);
    }

    @Override
    public boolean deleteCostumer(int costumerId) {
        System.out.println("Deleted " + costumerId);

        return false;
    }

    @Override
    public Costumers getCostumer(Costumers costumer) {

        return costumer;
    }

    @Override
    public ObservableList<Costumers> getAllCostumers() {
        ObservableList<Costumers> list = FXCollections.observableArrayList();

        Costumers costumers1 = new Costumers(1, "Mohamed", "Saeed", "456738", "Male", "Afternoon", 12.0, 1,
                "eDahab", "Empty", true, "Bashka", "tody", "monday");
        Costumers costumers2 = new Costumers(2, "Jamac", "uur", "456738", "Male", "Afternoon", 12.0, 1,
                "eDahab", "Empty", false, "Bashka", "tody", "monday");
        Costumers costumers3 = new Costumers(3, "Luul", "Cali", "456738", "Male", "Afternoon", 12.0, 1,
                "eDahab", "Empty", true, "Bashka", "tody", "monday");

        list.addAll(costumers1, costumers2, costumers3);

        return list;
    }


}
