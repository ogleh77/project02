package com.example.project02.conrtollers.servesescontroller;

import com.example.project02.actors.Users;
import com.example.project02.dao.UserDAO;
import com.example.project02.model.Model;
import com.example.project02.services.Loan;
import com.jfoenix.controls.JFXRadioButton;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoanController implements Initializable {
    @FXML
    private TextField amount;

    @FXML
    private ComboBox<String> chooseMember;

    @FXML
    private JFXRadioButton edahab;

    @FXML
    private TextField gaverName;

    @FXML
    private TextField phone;

    @FXML
    private TextField takername;

    @FXML
    private TextArea txtdispaly;

    @FXML
    private JFXRadioButton zaad;

    private Model model;
    private ObservableList<String> usersName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> {
        });
    }

    @FXML
    void choosedHandler(ActionEvent event) {
        gaverName.setText("Mohamed");
        if (!chooseMember.getValue().equalsIgnoreCase("other")) {
            phone.setEditable(true);
            takername.setEditable(true);
            phone.setText(null);
            takername.setText(null);
            for (Users users : model.getUserDAO().getAllUsers()) {
                if (users.getFirstName().equals(chooseMember.getValue())) {
                    takername.setText(users.getFirstName());
                    phone.setText(users.getPhone());
                    takername.setEditable(false);
                    phone.setEditable(false);
                }
            }
        } else {
            phone.setText(null);
            takername.setText(null);
//            phone.setEditable(false);
//            takername.setEditable(false);

        }

    }

    @FXML
    void submiHandler(ActionEvent event) {
        var loan = new Loan(gaverName.getText(), takername.getText(), phone.getText(), Double.parseDouble(amount.getText()), "Zaad");
        model.getLoanDAO().setLoan(loan);
    }

    public void setModel(Model model) {

        this.model = model;
        chooseMember.setItems(model.getUserDAO().getAlUsernames());

        System.out.println(model.getUserDAO().getAlUsernames());
    }
}
