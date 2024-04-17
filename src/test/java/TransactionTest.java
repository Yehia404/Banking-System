import com.example.bankingsystem.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {
    public Transaction t;

    @Test
    public void createTransaction(){
        Account acc1 = new Account("Yehia","1234","Yehia@gmail.com",3000);
        Account acc2 = new Account("Ahmed","2003","Ahmed@gmail.com",8500);
        assertNotNull(acc1);
        assertNotNull(acc2);

        acc1.transfer(acc2,1200);
        t=acc1.getTransactions().get(0);
        assertNotNull(t);

        assertEquals(1200,t.getAmount());

        assertEquals("Yehia",t.getSenderAcc().getName());
        assertEquals("1234",t.getSenderAcc().getPassword());
        assertEquals("Yehia@gmail.com",t.getSenderAcc().getEmail());
        assertEquals(1800,t.getSenderAcc().getBalance());

        assertEquals("Ahmed",t.getReceiverAcc().getName());
        assertEquals("2003",t.getReceiverAcc().getPassword());
        assertEquals("Ahmed@gmail.com",t.getReceiverAcc().getEmail());
        assertEquals(9700,t.getReceiverAcc().getBalance());

    }
}
