package codeup.hw1005;

import java.util.Scanner;

public class codeup_1020 {
    public static void main(String[] args) {
        // 주민번호 입력받아 형태 바꿔 출력하기
        Scanner sc = new Scanner(System.in);
        String[] number = sc.next().split("-");
        char a = sc.next().charAt(0);

        String num1 = number[0];
        String num2 = number[1];

        System.out.printf("%s%s", num1, num2);
        
    }
}
