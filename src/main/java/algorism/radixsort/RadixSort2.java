package algorism.radixsort;

import java.util.Arrays;

public class RadixSort2 {
    //    배열 10개를 만들고
    //    7,4,5,9,1,0 를 배열의 인덱스에 맞게 넣고
    //    앞에서부터 꺼내서 정렬하는 코드를 만들어 보세요
    public static int[] sort(int[] arr) {
        int[] array = new int[10];

        for (int i = 0; i < arr.length; i++) {
            array[arr[i]] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        return array;
    }
}
