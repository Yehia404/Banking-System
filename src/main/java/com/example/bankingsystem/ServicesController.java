package com.example.bankingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

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
    @FXML private Button statementBtn;

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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("balance.fxml"));
        root = loader.load();
        BalanceController balanceController = loader.getController();
        balanceController.setDetails();
        stage = (Stage) balanceBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void loanStatementPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loanstatement.fxml"));
        root = loader.load();
        LoanStatementController loanStatementController = loader.getController();
        loanStatementController.loanStatement();
        stage = (Stage) statementBtn.getScene().getWindow();
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
    public void statementPage(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("statement.fxml"));
        root = loader.load();
        StatementController statementController = loader.getController();
        statementController.listStatement();
        stage = (Stage) statementBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
