package codeup.hw1011;

import java.util.Scanner;

public class codeup_1046 {
    public static void main(String[] args) {
        // 정수 3개 입력받아 합과 평균 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = ((double) a + b + c) / 3;

        System.out.println(a + b +c);
        System.out.println(Math.round(avg * 10)/10.0);
    }
}
