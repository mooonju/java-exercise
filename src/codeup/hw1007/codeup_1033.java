package codeup.hw1007;

import java.util.Scanner;

public class codeup_1033 {
    public static void main(String[] args) {
        // 10진 정수 입력받아 16진수로 출력하기2 (대문자로 출력)
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Integer.toHexString(num).toUpperCase());

    }
}
