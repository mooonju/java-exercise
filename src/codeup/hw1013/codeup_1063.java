package codeup.hw1013;

import java.util.Scanner;

public class codeup_1063 {
    public static void main(String[] args) {
        // 두 정수 입력받아 큰 수 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d", a > b ? a : b);
    }
}
