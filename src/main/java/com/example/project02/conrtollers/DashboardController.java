package com.example.project02.conrtollers;

import com.example.project02.conrtollers.servesescontroller.LoanController;
import com.example.project02.generalize.General;
import com.example.project02.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import org.controlsfx.control.textfield.TextFields;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController extends General implements Initializable {
    private Model model;

    @FXML
    private StackPane stackPane;
    @FXML
    private BorderPane borderPane;
    @FXML
    private TextField searchBox;

    public DashboardController() {
        this.model = new Model();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TextFields.bindAutoCompletion(searchBox, model.getCostumers());
    }


    @FXML
    void notificationHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = openTabPane("/com/example/project02/views/services/notifications.fxml", stackPane);
    }


    @FXML
    void monthlyRegistrationHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = openWindow("/com/example/project02/views/registrationFXML.fxml", borderPane, stackPane);
        RegistrationController controller = loader.getController();
        controller.setModel(model);

    }

    @FXML
    void loanHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = openShortWindow("/com/example/project02/views/services/loan.fxml", stackPane);
        LoanController controller = loader.getController();
        controller.setModel(model);
    }

    @FXML
    void dailyReportHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = openWindow("/com/example/project02/views/services/report-form.fxml", borderPane, stackPane);
    }

    @FXML
    void salleryHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = openShortWindow("/com/example/project02/views/services/sallery.fxml", stackPane);
    }


    @FXML
    void gymOpHandler(ActionEvent event) throws IOException {
        FXMLLoader loader = openShortWindow("/com/example/project02/views/services/gymoperations.fxml", stackPane);
    }

}
