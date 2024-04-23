package com.example.bankingsystem;

import com.example.classes.Bank;
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
    @FXML private Button stmtBtn;
    @FXML private Button loanBtn;
    @FXML private TextField amountField;
    @FXML private Label label;


    public void loanStatementPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loanstatement.fxml"));
        root = loader.load();
        LoanStatementController loanStatementController = loader.getController();
        loanStatementController.loanStatement();
        stage = (Stage) stmtBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void loanRequest(ActionEvent event) throws IOException {
        if (amountField.getText().isEmpty()) {
            label.setStyle("-fx-text-fill: red;");
            label.setText("Please enter a valid amount");
        }
        if(amountField.getText().matches("\\d+(\\.\\d+)?")) {
            double amount = Double.parseDouble(amountField.getText());
            Bank.user.loanRequest(amount);
            label.setStyle("-fx-text-fill: green;");
            label.setText("Loan Request is Successful");
        }
        else{
            label.setStyle("-fx-text-fill: red;");
            label.setText("Please enter numbers!");
        }
    }
}
