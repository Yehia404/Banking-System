package com.example.bankingsystem;

import com.example.classes.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.classes.Bank.Login;


public class LoginController {

    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private TextField accField;
    @FXML private PasswordField passField;
    @FXML private Button loginButton;
    @FXML private Button createButton;
    @FXML private Label label;

    public void loginPage(ActionEvent event) throws IOException {
        if (accField.getText().isEmpty()) {
            label.setStyle("-fx-text-fill: red;");
            label.setText("Please enter a valid Account Id");
            return;
        }
        if (passField.getText().isEmpty()) {
            label.setStyle("-fx-text-fill: red;");
            label.setText("Please enter a valid password");
            return;
        }
        if (accField.getText().matches("\\d+")) {
            int accId = Integer.parseInt(accField.getText());
            String password = passField.getText();
            Account acc = Login(accId, password);
            if (acc != null) {
                root = FXMLLoader.load(getClass().getResource("services.fxml"));
                stage = (Stage) loginButton.getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                label.setStyle("-fx-text-fill: red;");
                label.setText("Invalid Credentials");
            }
        }
        else{
            label.setStyle("-fx-text-fill: red;");
            label.setText("Please enter id in numbers!");
        }
    }
    public void createAccountPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("createacc.fxml"));
        stage = (Stage) createButton.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}