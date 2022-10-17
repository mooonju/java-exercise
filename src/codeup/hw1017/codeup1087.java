package codeup.hw1017;

import java.util.Scanner;

public class codeup1087 {
    public static void main(String[] args) {
        // 여기까지! 이제 그만~
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
            if(sum >= num) {
                break;
            }
        }
        System.out.printf("%d", sum);
    }
}
