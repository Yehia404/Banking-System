package com.example.bankingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoanController {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private Button homeBtn;
    @FXML private Button loanBtn;
    @FXML private TextField amountField;
    @FXML private Label label;


    public void servicesPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("services.fxml"));
        stage = (Stage) homeBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void loanRequest(ActionEvent event) throws IOException {
        double amount = Double.parseDouble(amountField.getText());
        Bank.user.loanRequest(amount);
        label.setStyle("-fx-text-fill: green;");
        label.setText("Loan Request is Successful");
    }
}
