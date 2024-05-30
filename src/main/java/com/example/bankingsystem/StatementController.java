package com.example.bankingsystem;

import com.example.classes.Bank;
import com.example.classes.Transaction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;

public class StatementController {
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML private Parent root;


    @FXML private Button servicesBtn;
    @FXML
    private ListView<Transaction> listView;
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;
    @FXML private Label label5;
    @FXML private Label label6;

    public void listStatement() {
        ObservableList<Transaction> observableList = FXCollections.observableArrayList(Bank.user.getTransactions());
        listView.setItems(observableList);

        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                Transaction transaction = newValue;


                label1.setText("Transaction No: " + transaction.getTransactionNo());
                label2.setText("Sender Account Name: " + transaction.getSenderAcc().getName());
                label3.setText("Sender ID: " + transaction.getSenderAcc().getId());
                label4.setText("Receiver Account Name: " + transaction.getReceiverAcc().getName());
                label5.setText("Reciever ID: " + transaction.getReceiverAcc().getId());
                label6.setText("Amount: " + transaction.getAmount());
            }
        });
    }


    public void servicesPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("services.fxml"));
        stage = (Stage) servicesBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}
