package codeup.hw1006;

import java.util.Scanner;

public class codeup_1023 {
    public static void main(String[] args) {
        // 실수 1개 입력받아 부분별로 출력하기
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String[] str = String.valueOf(num).split("\\.");
        System.out.println(str[0]);
        System.out.println(str[1]);
    }
}
