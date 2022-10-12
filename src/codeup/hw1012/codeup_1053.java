package codeup.hw1012;

import java.util.Scanner;

public class codeup_1053 {
    public static void main(String[] args) {
        // 참 거짓 바꾸기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = (num == 0) ? 1 : 0;
        System.out.println(result);
    }
}
