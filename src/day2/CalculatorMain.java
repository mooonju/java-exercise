package day2;

public class CalculatorMain {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;

        Calculator calculator = new Calculator();
        calculator.plus(a, b);
        calculator.minus(a, b);
        calculator.multiple(a, b);
        calculator.divide(a, b);
    }
}
