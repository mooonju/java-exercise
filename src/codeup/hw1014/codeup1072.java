package codeup.hw1014;

import java.util.Scanner;

public class codeup1072 {
    public static void main(String[] args) {
        // 정수 입력받아 계속 출력하기
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
