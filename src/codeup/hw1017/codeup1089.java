package codeup.hw1017;

import java.util.Scanner;

public class codeup1089 {
    public static void main(String[] args) {
        // 수 나열하기1
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        // 1 4 7 10 13 16 19
        System.out.println(a + (b * (n - 1)));
    }
}
