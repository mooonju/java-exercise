package codeup.hw1007;

import java.util.Scanner;

public class codeup_1031 {
    public static void main(String[] args) {
        // 10진 정수 1개 입력받아 8진수로 출력하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Integer.toOctalString(num));
    }
}
