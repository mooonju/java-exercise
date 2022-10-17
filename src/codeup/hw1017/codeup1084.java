package codeup.hw1017;

import java.io.*;
import java.util.Scanner;

public class codeup1084 {
    public static void main(String[] args) throws IOException {
        // 빛 섞어 색 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < Integer.parseInt(str[0]); i++) {
            for (int j = 0; j < Integer.parseInt(str[1]); j++) {
                for (int k = 0; k < Integer.parseInt(str[2]); k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();





//        시간 초과
//        Scanner sc = new Scanner(System.in);
//
//        int r = sc.nextInt();
//        int g = sc.nextInt();
//        int b = sc.nextInt();
//        int count = 0;
//
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < g; j++) {
//                for (int k = 0; k < b; k++) {
//                    System.out.printf("%d %d %d\n", i, j, k);
//                    count++;
//                }
//            }
//        }
//        System.out.printf("%d", count);
    }
}
