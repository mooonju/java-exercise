package algorism.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci3 {
    // [기초-재귀함수] 재귀로 n번째 피보나치 수 리턴하기
    // https://codeup.kr/problem.php?id=1855
    public static int fib(int n) {
        // n이 1이나 2가 들어오면 재귀를 안 타고 return을 함
        if (n == 1 || n == 2) return 1; // 1일때 1 2일때 2
        return fib(n - 1) + fib(n - 2);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(fib(n));
    }
}
