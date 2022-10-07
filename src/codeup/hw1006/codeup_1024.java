package codeup.hw1006;

import java.util.Scanner;

public class codeup_1024 {
    public static void main(String[] args) {
        // 단어 1개 입력받아 나누어 출력하기
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        for(int i = 0; i < str.length; i++){
            System.out.println("\'"+str[i]+"\'");
        }

        
    }
}
