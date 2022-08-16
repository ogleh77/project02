package com.example.project02.interfaces.Iservice;

import com.example.project02.services.Sallery;
import javafx.collections.ObservableList;

public interface ISallery {

    void saveSallery();
    void updateSallery();

    ObservableList<Sallery>getALlSallery();
}
