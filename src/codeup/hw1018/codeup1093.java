package codeup.hw1018;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1093 {
    public static void main(String[] args) {
        // 이상한 출석 번호 부르기1
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[23];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[sc.nextInt()-1]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
