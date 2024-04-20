import com.example.classes.Account;
import com.example.classes.Loan;
import com.example.classes.Transaction;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    public Account acc;

    @Test
    @BeforeEach
    public void createAcc(){
        acc = new Account("Yehia","1234","Yehia@gmail.com",3000);
        assertNotNull(acc);
        assertEquals("Yehia",acc.getName());
        assertEquals("1234",acc.getPassword());
        assertEquals("Yehia@gmail.com",acc.getEmail());
        assertEquals(3000,acc.getBalance());
    }

    @Test
    @Order(1)
    public void withdrawTest(){
        acc.withdraw(550);
        assertEquals(2450,acc.getBalance());
    }

    @Test
    @Order(2)
    public void depositTest(){
        acc.deposit(1200);
        assertEquals(4200,acc.getBalance());
    }

    @Test
    @Order(3)
    public void loanTest(){
        acc.loanRequest(1000000);
        Loan loan = acc.getLoans().get(0);
        assertNotNull(loan);
    }

    @Test
    @Order(4)
    public void transferTest(){
        Account acc2 = new Account("Ahmed","2003","Ahmed@gmail.com",8500);
        assertNotNull(acc2);
        assertEquals("Ahmed",acc2.getName());
        assertEquals("2003",acc2.getPassword());
        assertEquals("Ahmed@gmail.com",acc2.getEmail());
        assertEquals(8500,acc2.getBalance());
        acc.transfer(acc2,500);
        Transaction t = acc.getTransactions().get(0);
        assertNotNull(t);
        assertEquals(2500,acc.getBalance());
        assertEquals(9000,acc2.getBalance());
    }

    @Test
    @AfterEach
    public void deleteAcc(){
        acc = null;
        assertNull(acc);
    }

}
