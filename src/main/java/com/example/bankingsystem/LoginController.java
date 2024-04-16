package com.example.bankingsystem;

import Classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

import static Classes.Bank.Login;


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
        int accId = Integer.parseInt(accField.getText());
        String password = passField.getText();
        Account acc = Login(accId,password);
        if(acc != null){
            root = FXMLLoader.load(getClass().getResource("services.fxml"));
            stage = (Stage) loginButton.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            label.setStyle("-fx-text-fill: red;");
            label.setText("Invalid Credentials");
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