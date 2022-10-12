package codeup.hw1012;

import java.util.Scanner;

public class codeup_1057 {
    public static void main(String[] args) {
        // 참/거짓이 서로 같을 때에만 참 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = (a == b) ? 1 : 0;
        System.out.println(result);
    }
}
