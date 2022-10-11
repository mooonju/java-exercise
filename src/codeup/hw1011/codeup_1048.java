package codeup.hw1011;

import java.util.Scanner;

public class codeup_1048 {
    public static void main(String[] args) {
        // 한 번에 2의 거듭제곱 배로 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * (int)(Math.pow(2, b)));
        // 거듭제곱 Math.pow
        // Math.pow(5, 2) == 5의 제곱은?
    }
}
