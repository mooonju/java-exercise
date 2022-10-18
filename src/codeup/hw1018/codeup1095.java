package codeup.hw1018;

import java.util.Scanner;

public class codeup1095 {
    public static void main(String[] args) {
        // 이상한 출석 번호 부르기3
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr= new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < i; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(temp);
    }
}
