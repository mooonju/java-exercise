package day2;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
        RandomCalculator randomCalculator = new RandomCalculator(randomNumberCreator);
        randomCalculator.plus(5);
        randomCalculator.minus(5);
        randomCalculator.multiple(5);
        randomCalculator.divide(5);
    }
}
