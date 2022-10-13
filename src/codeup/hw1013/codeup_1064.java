package codeup.hw1013;

import java.util.Scanner;

public class codeup_1064 {
    public static void main(String[] args) {
        // 정수 3개 입력받아 가장 작은 수 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = (a < b ? a : b) < c ? (a < b ? a: b) : c;
        System.out.println(result);
    }
}
