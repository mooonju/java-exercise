package algorism.kth;

import java.util.Arrays;

public class KthTest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        // arr 원하는 대로 자르기
        int[] arr1 = Arrays.copyOfRange(arr, 2 - 1, 5);
        System.out.println(Arrays.toString(arr1));
    }
}
