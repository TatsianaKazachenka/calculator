import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Retry;
import utils.TestDataProviders;

public class CalculatorTest extends BaseTest {

    @Test(dataProvider = "Incoming data for Amount", dataProviderClass = TestDataProviders.class, invocationCount = 3, threadPoolSize = 3)
    public void amountTest(double number1, double number2) {
        double actualAmount = calculator.amount(number1, number2);
        double expectedAmount = number1 + number2;
        Assert.assertEquals(actualAmount, expectedAmount);
    }

    @Parameters({"number1", "number2"})
    @Test(retryAnalyzer = Retry.class)
    public void differenceTest(double number1, double number2) {
        double actualDifference = calculator.difference(number1, number2);
        double expectedDifference = number1 - number2;
        Assert.assertEquals(actualDifference, expectedDifference);
    }

    @Test(dataProvider = "Incoming data for multiplication", dataProviderClass = TestDataProviders.class)
    public void multiplicationTest(double number1, double number2) {
        double actualMultiplication = calculator.multiplication(number1, number2);
        double expectedMultiplication = number1 * number2;
        Assert.assertEquals(actualMultiplication, expectedMultiplication);
    }

    @Test(dataProvider = "Incoming data for division", dataProviderClass = TestDataProviders.class)
    public void divisionTest(double number1, double number2) {
        double actualDivision = calculator.division(number1, number2);
        double expectedDivision = number1 / number2;
        Assert.assertEquals(actualDivision, expectedDivision);
    }
}
