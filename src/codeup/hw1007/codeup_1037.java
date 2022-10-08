package codeup.hw1007;

import java.util.Scanner;

public class codeup_1037 {
    public static void main(String[] args) {
        // 정수 입력받아 아스키 문자로 출력하기
        // 단, 0 ~ 255 범위의 정수만 입력된다.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(0 <= num && num <= 255){
            System.out.println((char)num);
        }
    }
}
