package codeup.hw1017;

import java.util.Scanner;

public class codeup1083 {
    public static void main(String[] args) {
        // 3 6 9 게임의 왕이 되자!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            if(i%3 != 0){
                System.out.printf("%d ", i);

            } else System.out.printf("%s ", "X");
        }
    }
}
