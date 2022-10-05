package codeup.hw1005;

import java.util.Scanner;

public class codeup_1015 {
    public static void main(String[] args) {
        // 실수 입력받아 둘째 자리까지 출력하기
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println(String.format("%.3f", num));

        
    }
}
