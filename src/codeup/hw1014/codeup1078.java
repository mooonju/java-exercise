package codeup.hw1014;

import java.util.Scanner;

public class codeup1078 {
    public static void main(String[] args) {
        // 짝수 합 구하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            if(i%2 == 0){
                sum = sum += i;
            }
        }
        System.out.println(sum);
    }
}
