package codeup.hw1006;

import java.util.Scanner;

public class codeup_1029 {
    public static void main(String[] args) {
        // 실수 1개 입력받아 그대로 출력하기2
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println(String.format("%.11f", num));
    }
}
