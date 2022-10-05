package day2;

public class Calculator {
    private  int a;
    private  int b;

    // 생성자 단축키 alt + insert

    // 생성자 추가하면서 매개변수 없애기
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus(){
        System.out.println(a + b);
    }
    public void minus(){
        System.out.println(a - b);
    }
    public void multiple(){
        System.out.println(a * b);
    }
    public void divide(){
        System.out.println((float) a / b);
    }
}
