package com.example.project02.conrtollers.servesescontroller;

import com.example.project02.dao.servicedeo.SalleryDAO;
import com.example.project02.services.Sallery;
import com.example.project02.services.Sallery;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SalleryController implements Initializable {
    private SalleryDAO salleryDAO;
    @FXML
    private TableColumn<Sallery, Integer> amaah;

    @FXML
    private TableColumn<Sallery, Integer> discount;

    @FXML
    private TableColumn<Sallery, Integer> month;

    @FXML
    private TableColumn<Sallery, Integer> monthlyCost;

    @FXML
    private TableView<Sallery> tbView;

    @FXML
    private Label totalPermount;

    public SalleryController() {
        salleryDAO = new SalleryDAO();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        monthlyCost.setCellValueFactory(new PropertyValueFactory<Sallery, Integer>("monthCosts"));
        discount.setCellValueFactory(new PropertyValueFactory<Sallery, Integer>("discount"));
        amaah.setCellValueFactory(new PropertyValueFactory<Sallery, Integer>("loan"));
        month.setCellValueFactory(new PropertyValueFactory<Sallery, Integer>("month"));
        tbView.setItems(salleryDAO.getALlSallery());

        totalPermount.setText("$"+String.valueOf(salleryDAO.getTotal()));
    }
}
