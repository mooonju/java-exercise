package codeup.hw1017;

import java.util.Scanner;

public class codeup1081 {

    public void printDice(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }

    public static void main(String[] args) {
        // 주사위를 2개 던지면?
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        codeup1081 cd = new codeup1081();
        cd.printDice(a, b);



    }
}
