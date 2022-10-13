package codeup.hw1013;

import java.util.Scanner;

public class codeup_1067 {
    public static void main(String[] args) {
        // 정수 1개 입력받아 분석하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        if(num%2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
