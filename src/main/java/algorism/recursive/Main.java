package algorism.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    // 재귀로 * n개 한 줄로 출력하기
    // https://codeup.kr/problem.php?id=

    public static void print(int num) {
        if (num <= 0) return;
        System.out.printf("*");
        print(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));
        int n = Integer.parseInt(bf.readLine());
        print(n);
    }
}
