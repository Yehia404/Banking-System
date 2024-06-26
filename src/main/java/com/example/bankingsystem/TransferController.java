package com.example.bankingsystem;

import com.example.classes.Account;
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


public class TransferController {

    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private Button homeBtn;
    @FXML private Button transferBtn;
    @FXML private TextField accountField;
    @FXML private TextField amountField;
    @FXML private Label label;


    public void servicesPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("services.fxml"));
        stage = (Stage) homeBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Transfer(ActionEvent event) throws IOException {
        if (accountField.getText().isEmpty()) {
            label.setStyle("-fx-text-fill: red;");
            label.setText("Please enter a valid Account Id");
            return;
        }
        if (amountField.getText().isEmpty()) {
            label.setStyle("-fx-text-fill: red;");
            label.setText("Please enter a valid amount");
            return;
        }
        if (accountField.getText().matches("\\d+")) {
            int id = Integer.parseInt(accountField.getText());
            if (id == Bank.user.getId()) {
                label.setStyle("-fx-text-fill: red;");
                label.setText("Cant transfer to same Account");
                return;
            }
            if(amountField.getText().matches("\\d+(\\.\\d+)?")) {
                double amount = Double.parseDouble((amountField.getText()));

                Account receiver = Bank.searchAcc(id);
                if (receiver == null) {
                    label.setStyle("-fx-text-fill: red;");
                    label.setText("Invalid ID");
                } else {
                    if (Bank.user.transfer(receiver, amount)) {
                        label.setStyle("-fx-text-fill: green;");
                        label.setText("Transfer is Successful");
                    } else {
                        label.setStyle("-fx-text-fill: red;");
                        label.setText("Insufficient Funds");
                    }
                }
            }
            else{
                label.setStyle("-fx-text-fill: red;");
                label.setText("Please enter numbers in amount!");
            }
        }
        else{
            label.setStyle("-fx-text-fill: red;");
            label.setText("Please enter numbers in id field!");
        }
    }
}
