import com.example.bankingsystem.Account;
import com.example.bankingsystem.Bank;
import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTesting {
    Bank bank;
    @BeforeEach
    public void createBank(){
       bank=new Bank();
   }
    @Test
    public void loginTest(){
        //id=0,pass=a
        Account acc1 = Bank.accounts.get(0);
        Account acc2 = Bank.Login(0,"a");
        assertTrue(acc1.equals(acc2));
        assertFalse(!acc1.equals(Bank.user));
        assertNotNull(Bank.user);
        assertArrayEquals(acc1.getLoans().toArray(), acc2.getLoans().toArray());
        Account acc3 = Bank.Login(13647,"fegeh");
        assertNull(acc3);
        assertNotEquals(acc2,acc3);
        assertNotEquals(acc3,Bank.user);
    }
    @Test
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
