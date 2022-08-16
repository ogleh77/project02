package com.example.project02.generalize;

import animatefx.animation.FadeIn;
import animatefx.animation.SlideInRight;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class General {

       final String MALE = "male";
    final String FEMALE = "female";
    private String gender = "";
    final boolean POXING = false;
    private final ObservableList<String> shift;
    private final ObservableList<String> paidBy;
    private final ObservableList<String> weight;
    private SimpleDateFormat df;


    public General() {
        shift = FXCollections.observableArrayList();
        paidBy = FXCollections.observableArrayList();
        weight = FXCollections.observableArrayList();
        shift.addAll("Morning", "Noon", "Afternoon", "Night");
        paidBy.addAll("eDahab", "Zaad service");
        weight.addAll("KG", "lbs");
        df = new SimpleDateFormat("yyyy-MM-dd");
    }

    public void selected(RadioButton radio1, RadioButton radio2) {
        if (radio1.isSelected()) {
            gender = MALE;

        } else if (radio2.isSelected()) {
            gender = FEMALE;
        }
    }

    public boolean isPoxing(CheckBox checkBox) {
        if (checkBox.isSelected()) {
            return true;
        }
        return false;
    }

    public Alert getAlert(Alert.AlertType type, String title, String contant) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(contant);
        alert.showAndWait();

        return alert;
    }


    public String getGender() {
        return gender;
    }

    public ObservableList<String> getShift() {
        return shift;
    }

    public ObservableList<String> getPaidBy() {
        return paidBy;
    }

    public ObservableList<String> getWeight() {
        return weight;
    }


    protected FXMLLoader openWindow(String url, BorderPane borderPane, StackPane stack) throws IOException {
        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(stack.getChildren().get(1));
        }
        FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
        AnchorPane anchorPane = loader.load();
        SlideInRight slideInRight = new SlideInRight(anchorPane);
        slideInRight.play();
        borderPane.setCenter(anchorPane);
        //Insha Allah laba jeer furanka ka jooji System.out.println(borderPane.getCenter().getId());
        return loader;
    }

    protected FXMLLoader openShortWindow(String url, StackPane stack) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
        AnchorPane anchorPane = null;
        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(stack.getChildren().get(1));
        }
        anchorPane = loader.load();
        new FadeIn(anchorPane).play();
        stack.getChildren().add(anchorPane);
        return loader;
    }

    protected FXMLLoader openTabPane(String url, StackPane stack) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
        TabPane tabPane = null;
        if (stack.getChildren().size() > 1) {
            stack.getChildren().remove(stack.getChildren().get(1));
        }
        tabPane = loader.load();
        //new FadeIn(anchorPane).play();
        stack.getChildren().add(tabPane);
        return loader;
    }

    protected File getImage() {
        File selectedFile = new File("/com/example/project02/images/27796e0eb8742d4465f6fb3ffac420d4.jpg");
        FileChooser chooser = new FileChooser();
        selectedFile = chooser.showOpenDialog(null);

        return selectedFile;
    }

}
