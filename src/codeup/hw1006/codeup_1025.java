package codeup.hw1006;

import java.util.Scanner;

public class codeup_1025 {
    public static void main(String[] args) {
        // 정수 1개 입력받아 나누어 출력하기 (정수는 다섯자리)
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");

        int cnt = 5;
        for(int i = 0; i < str.length; i++){
            cnt--;
            System.out.print("[" + str[i]);
            for(int j = 0; j < cnt; j++){
                System.out.print("0");
            }
            System.out.println("]");
        }

    }
}
