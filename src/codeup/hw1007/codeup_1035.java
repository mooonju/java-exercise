package codeup.hw1007;

import java.util.Scanner;

public class codeup_1035 {
    public static void main(String[] args) {
        // 16진 정수 1개 입력받아 8진수로 출력하기
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next(), 16);
        System.out.println(Integer.toOctalString(num));
        
    }
}
