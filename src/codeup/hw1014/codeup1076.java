package codeup.hw1014;

import java.util.Scanner;

public class codeup1076 {
    public static void main(String[] args) {
        // 문자 1개 입력받아 알파벳 출력하기
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char start = 'a';
        while (start <= ch){
            System.out.println(start);
            start += 1;
        }


    }
}
