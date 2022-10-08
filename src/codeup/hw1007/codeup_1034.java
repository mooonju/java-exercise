package codeup.hw1007;

import java.util.Scanner;

public class codeup_1034 {
    public static void main(String[] args) {
        // 8진 정수 1개 입력받아 10진수로 출력하기
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next(), 8);
        System.out.println(num);
        
    }
}
