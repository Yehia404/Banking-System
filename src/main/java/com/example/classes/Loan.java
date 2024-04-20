package com.example.classes;

public class Loan {
    private int loanId;
    private static int counter=0;
    private double loanAmount;

    public Loan(double loanAmount) {
        this.loanId=counter++;
        this.loanAmount = loanAmount;
    }

    public int getLoanId() {
        return loanId;
    }


    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "Loan ID: " + loanId + "\nLoan Amount: " + loanAmount;
    }

}
