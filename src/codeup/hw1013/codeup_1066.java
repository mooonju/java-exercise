package codeup.hw1013;

import java.util.Scanner;

public class codeup_1066 {

    public void PrintEvenOdd(int[] num){
        for(int i=0; i<num.length; i++){
            if(num[i]%2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }

    public static void main(String[] args) {
        // 정수 3개 입력받아 짝/홀 출력하기
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        codeup_1066 cd = new codeup_1066();
        cd.PrintEvenOdd(num);
    }
}
