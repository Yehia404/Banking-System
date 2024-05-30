import com.example.classes.Loan;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class LoanTest {
    @Test
    public void createLoanTest(){
        double amount =1234.54;
        Loan loan= new Loan(amount);
        assertNotNull(loan);
        assertEquals(amount,loan.getLoanAmount());
        loan.setLoanAmount(12356.0);
        assertNotEquals(amount,loan.getLoanAmount());
    }
}
