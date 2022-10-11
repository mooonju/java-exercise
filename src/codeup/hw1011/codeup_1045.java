package codeup.hw1011;

import java.util.Scanner;

public class codeup_1045 {
    public static void main(String[] args) {
        // 정수 2개 입력받아 자동 계산하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.printf("%.2f", (float)a / b);
    }
}
