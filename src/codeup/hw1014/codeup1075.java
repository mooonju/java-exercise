package codeup.hw1014;

import java.util.Scanner;

public class codeup1075 {
    public static void main(String[] args) {
        // 정수 1개 입력받아 카운트다운 출력하기2
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0){
            System.out.println(--num);
        }


    }
}
