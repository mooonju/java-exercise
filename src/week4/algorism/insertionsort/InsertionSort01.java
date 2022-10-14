package week4.algorism.insertionsort;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr) {
        // i = 2 일 때 arr[2] vs arr [1]
        for(int i =1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if (arr[j] < arr[j-1]) { // arr[1] vs arr[0]
                    // swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//        i:1 j:1 j-1:0
//        i:2 j:2 j-1:1
//        i:2 j:1 j-1:0
//        i:3 j:3 j-1:2
//        i:3 j:2 j-1:1
//        i:3 j:1 j-1:0
//        i:4 j:4 j-1:3
//        i:4 j:3 j-1:2
//        i:4 j:2 j-1:1
//        i:4 j:1 j-1:0

        return arr;
    }

    public static void main(String[] args) {
        // 5부터 출발 idx=1
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort01 is = new InsertionSort01();
//      arr = new int[]{5, 8, 6, 2, 4};
        int[] result = is.sort(arr);
        System.out.println(Arrays.toString(result));


    }
}
