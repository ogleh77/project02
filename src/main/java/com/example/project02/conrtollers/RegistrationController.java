package com.example.project02.conrtollers;

import com.example.project02.actors.Costumers;
import com.example.project02.generalize.General;
import com.example.project02.model.Model;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class RegistrationController extends General implements Initializable {

    @FXML
    private TextField amountPaid;

    @FXML
    private JFXButton clear;

    @FXML
    private TextField discount;

    @FXML
    private JFXRadioButton female;

    @FXML
    private TextField firstname;

    @FXML
    private ImageView imgView;

    @FXML
    private TextField lastname;

    @FXML
    private JFXRadioButton male;

    @FXML
    private ComboBox<String> paidby;

    @FXML
    private TextField phone;

    @FXML
    private JFXCheckBox poxing;

    @FXML
    private ComboBox<String> shift;

    @FXML
    private TextField weight;

    @FXML
    private ComboBox<String> weight_type;

    @FXML
    private JFXCheckBox yes_discount;

    private Model model;
    private File selectedFile = null;
    private boolean discountEnable = true;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        weight_type.setItems(getWeight());
        shift.setItems(getShift());
        paidby.setItems(getPaidBy());
        ToggleGroup genderToggle = new ToggleGroup();
        male.setToggleGroup(genderToggle);
        female.setToggleGroup(genderToggle);

    }

    public void setModel(Model model) {
        this.model = model;
    }

    @FXML
    void saveHandler(ActionEvent event) {
        selected(male, female);
        isPoxing(poxing);

        Costumers costumers = new Costumers(firstname.getText(), lastname.getText(), phone.getText(), getGender(), shift.getValue(), Double.parseDouble(amountPaid.getText()), 0,
                paidby.getValue(), selectedFile.getAbsolutePath(), true, "Bashka");
        model.getCostumerDAO().insertCostumer(costumers);
        model.getCostumers().add(costumers);
        getAlert(Alert.AlertType.INFORMATION, "INFORMATION", "Seccessfully saved..");
        discount.setDisable(discountEnable);
        discount.visibleProperty().bind(yes_discount.selectedProperty());
    }

    @FXML
    void uploadHandler(ActionEvent event) {

        selectedFile = getImage();
        imgView.setImage(new Image(selectedFile.getAbsolutePath()));
        System.out.println(selectedFile);
    }


    @FXML
    void clicked(ActionEvent event) {

    }


}
