package day2;

public class Calculator {
    public void plus(int a, int b){
        System.out.println(a + b);
    }
    public void minus(int a, int b){
        System.out.println(a - b);
    }
    public void multiple(int a, int b){
        System.out.println(a * b);
    }
    public void divide(int a, int b){
        float result = (float) a / b;
        System.out.println(result);
    }
}
