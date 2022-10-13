package codeup.hw1013;

import java.util.Scanner;

public class codeup_1068 {
    public static void main(String[] args) {
        // 정수 1개 입력받아 평가 출력하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(90 <= num && num <= 100){
            System.out.println("A");
        } else if (70 <= num && num < 90) {
            System.out.println("B");
        } else if (40 <= num && num < 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
