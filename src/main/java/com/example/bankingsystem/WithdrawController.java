package com.example.bankingsystem;

import com.example.classes.Bank;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;

import java.io.IOException;

public class WithdrawController {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private Button homebtn;
    @FXML private Button confirm;
    @FXML private TextField amount;
    @FXML private Label currentbalance;

    public void withdraw(ActionEvent event) throws IOException {
        if (amount.getText().isEmpty()) {
            currentbalance.setStyle("-fx-text-fill: red;");
            currentbalance.setText("Please enter a valid amount");
            return;
        }

        if(amount.getText().matches("\\d+(\\.\\d+)?")) {
            double am = Double.parseDouble(amount.getText());
            boolean bool = Bank.user.withdraw(am);
            if (bool) {
                currentbalance.setStyle("-fx-text-fill: green;");
                currentbalance.setText("Current Balance: " + Bank.user.getBalance());
            } else {
                currentbalance.setStyle("-fx-text-fill: red;");
                currentbalance.setText("Sorry, your balance is insufficient");
            }
        }
        else{
            currentbalance.setStyle("-fx-text-fill: red;");
            currentbalance.setText("Please enter numbers!");
        }
    }


    public void ServicesPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("services.fxml"));
        stage = (Stage) homebtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
