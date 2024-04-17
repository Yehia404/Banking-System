import com.example.bankingsystem.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;



public class BankTest {
    Bank bank;


    @BeforeEach
    public void createBank(){
        bank=new Bank();
   }


   @Test
   @Order(1)
    public void loginTest(){
        //id=0,pass=a
        Account acc1 = Bank.accounts.get(0);
        Account acc2 = Bank.Login(0,"a");
        assertTrue(acc1.equals(acc2));
        assertTrue(acc1.equals(Bank.user));
        assertNotNull(Bank.user);
        assertArrayEquals(acc1.getLoans().toArray(), acc2.getLoans().toArray());
        Account acc3 = Bank.Login(13647,"fegeh");
        assertNull(acc3);
        assertNotEquals(acc2,acc3);
        assertNotEquals(acc3,Bank.user);
    }
    @Test
    @Order(2)
    public void searchTesting() {
        //id=0
        Account acc1 = Bank.accounts.get(0);
        Account acc2 = Bank.searchAcc(0);
        assertEquals(acc1, acc2);
        Account acc3 = Bank.searchAcc(1375476);
        assertNull(acc3);
        assertNotEquals(acc2,acc3);
    }
    @Test
    @AfterEach
    public void terminateBank(){
       bank=null;
       assertNull(bank);
    }

}
