package codeup.hw1006;

import java.util.Scanner;

public class codeup_1026 {
    public static void main(String[] args) {
        // 시분초 입력받아 분만 출력하기
        Scanner sc = new Scanner(System.in);
        String str[] = sc.next().split(":");
        System.out.println(Integer.parseInt(str[1]));
        
    }
}
