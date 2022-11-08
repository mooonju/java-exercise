package algorism.binarysearch.simplesearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 단순탐색
        // 코드업 3001 데이터 탐색
        // https://codeup.kr/problem.php?id=3001
        // 10 배열의 개수
        // 2 3 7 4 9 10 223 111 23 39 배열
        // 111 찾아야 하는 수

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }

        System.out.println(answer);
    }
}
