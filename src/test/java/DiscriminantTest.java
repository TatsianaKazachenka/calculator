import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DiscriminantTest extends BaseTest {
    double descriminant;

    @Parameters({"a", "b", "c"})
    @Test(description = "D = b*b-4*a*c", priority = 1)
    public void calculationDescriminant(double a, double b, double c) {
        double square = calculator.multiplication(b, b);//b
        double mult = calculator.multiplication(a, c);//ac
        double multiplication = calculator.multiplication(4, mult); //4ac
        descriminant = calculator.difference(square, multiplication);
        double expectedDescriminant = b * b - 4 * a * c;
        Assert.assertEquals(descriminant, expectedDescriminant);
    }

    @Parameters({"a", "b", "c"})
    @Test(description = "calculation of the roots of the equation", priority = 2)
    public void disctiminantTest(double a, double b, double c) {
        if (descriminant > 0) {
            double x1 = (-b + Math.sqrt(descriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(descriminant)) / (2 * a);
            List<Double> resultExpected = new ArrayList<>();
            resultExpected.add(x1);
            resultExpected.add(x2);
            List<Double> result = discriminantCalculator.disctiminantPositiveTest(descriminant, b, a);
            Assert.assertEquals(result, resultExpected);
        } else if (descriminant == 0) {
            double result = discriminantCalculator.disctiminantZeroTest(b, a);
            double resultExpected = (-b / 2 * a);
            Assert.assertEquals(result, resultExpected);
        }
    }
}
