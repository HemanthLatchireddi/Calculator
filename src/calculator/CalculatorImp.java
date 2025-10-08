package calculator;

public class CalculatorImp implements CalculatorInterface {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public String division(double a, double b) {
        if(b==0) {
            return "Error:Cannot divisible by Zero";
        }
        return String.valueOf(a / b);

    }
}
