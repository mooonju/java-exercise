package codeup.hw1012;

import java.util.Scanner;

public class codeup_1055 {
    public static void main(String[] args) {
        // 하나라도 참이면 참 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 1 || b == 1){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
