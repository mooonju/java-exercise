package codeup.hw1012;

import java.util.Scanner;

public class codeup_1052 {
    public static void main(String[] args) {
        // 두 정수 입력받아 비교하기4
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (a != b) ? 1 : 0;
        System.out.println(result);
    }
}
