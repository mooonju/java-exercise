package codeup.hw1018;

import java.util.Scanner;

public class codeup1094 {
    public static void main(String[] args) {
        // 이상한 출석 번호 부르기2
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = num-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
