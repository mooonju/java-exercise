package codeup.hw1017;

import java.util.Scanner;

public class codeup1086 {
    public static void main(String[] args) {
        // 그림 파일 저장용량 계산하기
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();

        double result = ((double) w * h * b) / 1024 / 1024 / 8;
        System.out.printf("%.2f MB", result);
    }
}
