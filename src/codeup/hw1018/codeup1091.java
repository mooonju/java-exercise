package codeup.hw1018;

import java.util.Scanner;

public class codeup1091 {
    public static void main(String[] args) {
        // 수 나열하기3
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시작 값
        int m = sc.nextInt(); // 곱할 값
        int d = sc.nextInt(); // 더할 값
        int n = sc.nextInt(); // 몇번째인지

        long num = a; // int num 에러
        // (a * m)+d
        for (int i = 1; i < n; i++) {
            num = (num * m) +d;
        }

        System.out.println(num);
    }
}
