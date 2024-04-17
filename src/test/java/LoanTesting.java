import com.example.bankingsystem.Loan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoanTesting {
    @Test
    public void createLoan(){
        double amount =1234.54;
        Loan loan= new Loan(amount);
        assertNotNull(loan);
        assertEquals(amount,loan.getLoanAmount());
        loan.setLoanAmount(12356.0);
        assertNotEquals(amount,loan.getLoanAmount());
    }
}
