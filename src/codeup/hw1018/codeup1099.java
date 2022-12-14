package codeup.hw1018;

import java.util.Scanner;

public class codeup1099 {
    public static void main(String[] args) {
        // 성실한 개미
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        // 배열 생성
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int flag = 1; // y값
        int end = 0; // 종료

        // 반복
        for (int i = 1; i < arr.length; i++) {
            if (end != 1) {
                for (int j = flag; j < arr.length; j++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 9;
                    } else if (arr[i][j] == 2) {
                        arr[i][j] = 9;
                        end = 1;
                        break;
                    } else {
                        flag = j - 1;
                        break;
                    }
                }
            } else {
                break;
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
