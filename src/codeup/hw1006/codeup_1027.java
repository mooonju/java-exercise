package codeup.hw1006;

import java.util.Scanner;

public class codeup_1027 {
    public static void main(String[] args) {
        // 년월일 입력 받아 형식 바꿔 출력하기
        Scanner sc = new Scanner(System.in);
        String str[] = sc.next().split("\\.");
        int str1 = Integer.parseInt(str[0]);
        int str2 = Integer.parseInt(str[1]);
        int str3 = Integer.parseInt(str[2]);
        System.out.printf("%02d-%02d-%04d", str3, str2, str1);
        
    }
}
