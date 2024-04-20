package com.example.bankingsystem;

import com.example.classes.Bank;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class BalanceController {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private Label emailLabel;
    @FXML private Label nameLabel;
    @FXML private Label balanceLabel;
    @FXML private Label idLabel;
    @FXML private Button Homesbtn;
    public void setDetails(){
        emailLabel.setText("Email: "+ Bank.user.getEmail());
        nameLabel.setText("Name: "+ Bank.user.getName());
        idLabel.setText("ID: "+ Bank.user.getId());
        balanceLabel.setText("Balance: "+ Bank.user.getBalance());
    }
    public void ServicesPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("services.fxml"));
        stage = (Stage) Homesbtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
