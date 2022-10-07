package codeup.hw1005;

import java.util.Scanner;

public class codeup_1019 {
    public static void main(String[] args) {
        // 연월일 입력받아 그대로 출력하기
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("\\.");
        // split 사용시 '.'을 기준으로 분리해야 하는 경우 [.] 또는 \\. 사용해서 분리 필요

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.printf(String.format("%04d.%02d.%02d", year, month, day));
        
    }
}
