import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("System Test Suite")
@SelectClasses({
        AccountTest.class,
        BankTest.class,
        LoanTest.class,
        TransactionTest.class
})
public class BankTestSuite {
}