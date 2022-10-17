package codeup.hw1017;

import java.util.Scanner;

public class codeup1082 {
    public static void main(String[] args) {
        // 16진수 구구단?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(16);

        for (int i = 1; i < 16; i++) {
            System.out.printf("%X * %X = %X\n", num, i, num * i);
        }
    }
}
