package algorism.recursive;

public class Print1To100V2 {
    public static void print1To100(int n) {
        if (n > 100) return; // 탈출 조건 추가
        System.out.println(n);
        print1To100(n + 1);
    }
    public static void main(String[] args) {
        print1To100(1);
    }
}