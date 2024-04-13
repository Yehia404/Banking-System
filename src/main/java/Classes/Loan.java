package Classes;

public class Loan {
    private static int loanId = 0;
    private double loanAmount;

    public Loan(double loanAmount) {
        loanId++;
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
