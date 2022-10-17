package codeup.hw1017;

import java.util.Scanner;

public class codeup1088 {
    public static void main(String[] args) {
        // 3의 배수는 통과?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            if(i%3 != 0) {
                System.out.printf("%d ", i);
            } else System.out.printf("");
        }
    }
}
