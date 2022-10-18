package codeup.hw1018;

import java.util.Scanner;

public class codeup1096 {
    public static void main(String[] args) {
        // 바둑판에 흰 돌 놓기
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x-1][y-1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
