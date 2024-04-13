package com.example.bankingsystem;

import Classes.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static Classes.Bank.Login;

public class ServicesController {
    @FXML
    private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;


    @FXML private Button transferBtn;
    @FXML private Button balanceBtn;
    @FXML private Button loanBtn;
    @FXML private Button depositBtn;
    @FXML private Button withdrawBtn;
    @FXML private Button loginBtn;
    public void loginPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage) loginBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void transferPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("transfer.fxml"));
        stage = (Stage) transferBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void balancePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("balance.fxml"));
        stage = (Stage) balanceBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void loanPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("loan.fxml"));
        stage = (Stage) loanBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void depositPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("deposit.fxml"));
        stage = (Stage) depositBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void withdrawPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("withdraw.fxml"));
        stage = (Stage) withdrawBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
