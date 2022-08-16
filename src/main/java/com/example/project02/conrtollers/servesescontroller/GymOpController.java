package com.example.project02.conrtollers.servesescontroller;

import com.example.project02.dao.servicedeo.GymOpDAO;
import com.example.project02.services.Box;
import com.example.project02.services.GymOperations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class GymOpController implements Initializable {
    @FXML
    private TextField boxCost;

    @FXML
    private TextField boxName;

    @FXML
    private ComboBox<Box> boxesList;

    @FXML
    private TextField fitnesCost;

    @FXML
    private TextField gymName;

    @FXML
    private TextField maxDiscount;

    @FXML
    private TextField poxingCost;

    @FXML
    void addHandler(ActionEvent event) {

    }

    @FXML
    void submiHandler(ActionEvent event) {

    }

    private GymOpDAO gymOpDAO;

    public GymOpController() {
        gymOpDAO = new GymOpDAO();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gymName.setText(gymOpDAO.getGymOp().getGymName());
        fitnesCost.setText(String.valueOf(gymOpDAO.getGymOp().getFitnessCost()));
        poxingCost.setText(String.valueOf(gymOpDAO.getGymOp().getPoxingCost()));
        maxDiscount.setText(String.valueOf(gymOpDAO.getGymOp().getMaxDiscount()));
        boxesList.setItems(gymOpDAO.getGymOp().getVipBoxes());
    }

    @FXML
    void selectedBox(ActionEvent event) {
        Box box = boxesList.getValue();
        System.out.println(boxesList.getValue());
    }


}
