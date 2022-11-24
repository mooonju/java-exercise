package algorism.recursive;

public class Fibonacci2 {
    public static int fib(int n) {
        // n이 1이나 2가 들어오면 재귀를 안 타고 return을 함
        if (n == 1 || n == 2) return 1; // 1일때 1 2일때 2
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int r = fib(6);
        System.out.println(r);
    }
}
