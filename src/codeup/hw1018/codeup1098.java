package codeup.hw1018;

import java.util.Scanner;

public class codeup1098 {
    public static void main(String[] args) {
        // 설탕과자 뽑기
        Scanner sc = new Scanner(System.in);
        int idx1 = sc.nextInt();
        int idx2 = sc.nextInt();
        int[][] arr = new int[idx1][idx2];

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            if(d ==0) {
                for (int j = y; j < y+l; j++) {
                    arr[x][j] = 1;
                }
            } else {
                for (int j = x; j < x+l; j++) {
                    arr[j][y] = 1;
                }
            }
        }

        for (int i = 0; i < idx1; i++) {
            for (int j = 0; j < idx2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
