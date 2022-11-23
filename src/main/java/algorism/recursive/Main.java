package algorism.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void print(int num) {
        // 재귀로 * n개 한 줄로 출력하기
        // https://codeup.kr/problem.php?id=
        if (num <= 0) return;
        System.out.printf("*");
        print(num - 1);
    }

    public static int sum(int num) {
        // 정수 n을 입력받아 1부터 n까지 정수 합 출력하기
        if (num == 0) return num;
        return num + sum(num - 1);
    }

    public static int sumOfDigit(int q) {
        // 재귀로 각 자리 수의 합 구하기
        if (q == 0) return 0;
        return q % 10 + sumOfDigit(q / 10);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));
        int n = Integer.parseInt(bf.readLine());
        print(n);
    }
}
