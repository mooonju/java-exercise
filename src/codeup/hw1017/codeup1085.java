package codeup.hw1017;

import java.util.Scanner;

public class codeup1085 {
    public static void main(String[] args) {
        // 소리 파일 저장용량 계산하기
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        double result = ((double) h * b * c * s) / 1024 / 1024 / 8;
        System.out.printf("%.1f MB", result);
    }
}
