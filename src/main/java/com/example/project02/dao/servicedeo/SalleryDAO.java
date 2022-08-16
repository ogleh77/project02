package com.example.project02.dao.servicedeo;

import com.example.project02.interfaces.Iservice.ISallery;
import com.example.project02.services.Sallery;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SalleryDAO implements ISallery {
    @Override
    public void saveSallery() {

    }

    @Override
    public void updateSallery() {

    }

    @Override
    public ObservableList<Sallery> getALlSallery() {
        ObservableList<Sallery> salleries = FXCollections.observableArrayList();

        Sallery sallery = new Sallery(1, 200, 10, "June");
        Sallery sallery1 = new Sallery(2, 134, 10, "June");
        Sallery sallery2 = new Sallery(3, 222, 10, "June");
        Sallery sallery3 = new Sallery(4, 333, 10, "June");
        Sallery sallery4 = new Sallery(5, 123, 10, "June");
        Sallery sallery5 = new Sallery(6, 230, 10, "June");

        salleries.addAll(sallery1, sallery2, sallery4, sallery5);

        return salleries;
    }

    public double getTotal() {
        double total = 0;
        for (Sallery sallery : getALlSallery()) {
            total += sallery.getMonthCosts();
        }

        return total;
    }
}
