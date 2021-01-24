import java.util.ArrayList;
import java.util.List;

public class DiscriminantCalculator extends ArithmeticException {
    Calculator calculator = new Calculator();

    public List<Double> disctiminantPositiveTest(double discriminantm, double b, double a) {
        double x1 = calculator.division(calculator.difference(Math.sqrt(discriminantm), b), calculator.multiplication(2, a));
        double x2 = calculator.division(-calculator.difference(Math.sqrt(discriminantm), b), calculator.multiplication(2, a));
        List<Double> result = new ArrayList<>();
        result.add(x1);
        result.add(x2);
        return result;
    }

    public double disctiminantZeroTest(double b, double a) {
        return calculator.division(-b, calculator.multiplication(2, a));
    }
}
