package algorism.eratosthenes;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        // 에라토스테네스의 체

        // 2~50까지 들어 있는 배열 생성
        int N = 50;
        int[] arr = new int[N - 1];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
           arr[i] = i + 2;
        }
        System.out.println(Arrays.toString(arr));


    }
}
