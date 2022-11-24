package algorism.recursive;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    // 재귀 피보나치 수열
    public static void main(String[] args) {

//        List<Integer> fibonacciNums = new ArrayList<>();
//        // n = 7, 1 1 2 3 5 8 13 --> 7개
//        // n = 8, 1 1 2 3 5 8 13 21 --> 8개
//        int i = 0;
//        fibonacciNums.add(1); // first
//        i = 1;
//        fibonacciNums.add(1); // second
//        i = 2;
//        fibonacciNums.add(fibonacciNums.get(1) + fibonacciNums.get(0));
//        i = 3;
//        fibonacciNums.add(fibonacciNums.get(2) + fibonacciNums.get(1));

        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1);
        fibonacciNums.add(1);
        for (int j = 2; j < 7; j++) {
            fibonacciNums.add(fibonacciNums.get(j - 1) + fibonacciNums.get(j - 2));
        }
        System.out.println(fibonacciNums);
    }
}
