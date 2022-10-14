package week4.algorism.insertionsort;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr) {
        int i = 1;


        return new int[]{};
    }

    public static void main(String[] args) {
        // 5부터 출발 idx=1
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort01 is = new InsertionSort01();
        int[] result = is.sort(arr);
        System.out.println(Arrays.toString(result));


    }
}
