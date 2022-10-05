package codeup.hw1005;

import java.util.Scanner;

public class codeup_1014 {
    public static void main(String[] args) {
        // 문자 2개 입력받아 순서 바꿔 출력하기
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);

        System.out.printf("%c %c", y, x);
    }
}
