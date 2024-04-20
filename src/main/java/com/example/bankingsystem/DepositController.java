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
import javafx.stage.Stage;

import java.io.IOException;

public class DepositController {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private Button homebtn;
    @FXML private Button confirm;
    @FXML private TextField amount;
    @FXML private Label currentbalance;
    public void deposit(ActionEvent event) throws IOException{
        double am = Double.parseDouble(amount.getText());
        Bank.user.deposit(am);
        currentbalance.setStyle("-fx-text-fill: green;");
        currentbalance.setText("Current Balance: "+Bank.user.getBalance());
    }
    public void ServicesPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("services.fxml"));
        stage = (Stage) homebtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
