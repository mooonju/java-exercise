package codeup.hw1012;

import java.util.Scanner;

public class codeup_1054 {
    public static void main(String[] args) {
        // 둘 다 참일 경우만 참 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 1 && b == 1){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
