package codeup.hw1013;

import java.util.Scanner;

public class codeup_1065 {

    public void PrintNum(int[] num){
        for(int i=0; i<num.length; i++){
            if(num[i]%2 == 0){
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        // 정수 3개 입력받아 짝수만 출력하기
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];

        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        codeup_1065 cd = new codeup_1065();
        cd.PrintNum(num);
    }
}
