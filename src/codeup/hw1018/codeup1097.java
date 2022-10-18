package codeup.hw1018;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1097 {
    public static void main(String[] args) {
        // 바둑알 십자 뒤집기
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[19][19];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            for (int j = 0; j < arr.length; j++) {
                if(arr[x][j] == 0){
                    arr[x][j] = 1;
                } else {
                    arr[x][j] = 0;
                }
            }

            for (int j = 0; j < arr.length; j++) {
                if(arr[j][y] == 0){
                    arr[j][y] = 1;
                } else {
                    arr[j][y] = 0;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
