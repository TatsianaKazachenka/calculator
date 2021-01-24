public class Calculator extends ArithmeticException {
    public double amount(double a, double b) {
        return a + b;
    }

    public double difference(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        return a / b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }
}
