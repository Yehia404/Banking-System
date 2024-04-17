package com.example.bankingsystem;

public class Transaction {

    private static  int transactionNo = 0;
    private Account senderAcc;
    private Account receiverAcc;
    private double amount;

    public Transaction(Account senderAcc, Account receiverAcc, double amount) {
        transactionNo++;
        this.senderAcc = senderAcc;
        this.receiverAcc = receiverAcc;
        this.amount = amount;
    }

    public int getTransactionNo() {
        return transactionNo;
    }


    public Account getSenderAcc() {
        return senderAcc;
    }

    public void setSenderAcc(Account senderAcc) {
        this.senderAcc = senderAcc;
    }

    public Account getReceiverAcc() {
        return receiverAcc;
    }

    public void setReceiverAcc(Account receiverAcc) {
        this.receiverAcc = receiverAcc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction No: " + transactionNo +
                "\nSender Account: " + senderAcc.getName() +
                "\nReceiver Account: " + receiverAcc.getName() +
                "\nAmount: " + amount;
    }
}
