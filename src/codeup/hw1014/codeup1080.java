package codeup.hw1014;

import java.util.Scanner;

public class codeup1080 {
    public static void main(String[] args) {
        // 언제까지 더해야 할까?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;

        for(i=1; i<num; i++) {
            num-=i;
        }

        System.out.println(i);
    }
}
