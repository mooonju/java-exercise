package codeup.hw1017;

import java.util.Scanner;

public class codeup1090 {
    public static void main(String[] args) {
        // 수 나열하기2
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 2
        int b = sc.nextInt(); // 3
        int n = sc.nextInt(); // 7

        // 2 6 18 54 162 486 1458
/*        for (int i =1; i < n; i++) {
            a = a * b;
        }*/
        long result = a * ((long)Math.pow(b, n -1));
        System.out.println(result);
    }
}
