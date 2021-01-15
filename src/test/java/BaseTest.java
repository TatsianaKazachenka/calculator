import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {
    Calculator calculator;
    DiscriminantCalculator discriminantCalculator;

    @BeforeMethod
    public void init() {
        calculator = new Calculator();
        discriminantCalculator = new DiscriminantCalculator();
    }

    @AfterMethod
    public void clearArray() {
        //I force the garbage collector to run
        System.gc();
    }

}
