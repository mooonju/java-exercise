package algorism.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            System.out.println(Arrays.toString(arr));
        }

//        int i = 0;
//        // arr[0]번째에 들어갈 값 찾기
//        // 그 값이 들어 있는 index 찾기 -- 0번 인덱스
//        int minIdx = 0; // 최솟값 찾기
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[minIdx] > arr[j]) minIdx = j;
//        }
//        int temp = arr[0];
//        arr[0] = arr[minIdx];
//        arr[minIdx] = temp;
//        System.out.println(Arrays.toString(arr));
//
//        i = 1;
//        // arr[1]번째에 들어갈 값 찾기
//        // 그 값이 들어 있는 index 찾기 -- 8번 인덱스
//        minIdx = 1; // 최솟값 찾기
//        for (int j = 1; j < arr.length; j++) {
//            if (arr[minIdx] > arr[j]) minIdx = j;
//        }
//        temp = arr[1];
//        arr[1] = arr[minIdx];
//        arr[minIdx] = temp;
//        System.out.println(Arrays.toString(arr));
//
//        i = 2;
//        // arr[2]번째에 들어갈 값 찾기
//        minIdx = 2; // 최솟값 찾기
//        for (int j = 2; j < arr.length; j++) {
//            if (arr[minIdx] > arr[j]) minIdx = j;
//        }
//        temp = arr[2];
//        arr[2] = arr[minIdx];
//        arr[minIdx] = temp;
//        System.out.println(Arrays.toString(arr));
//
//
//        i = 3;
//        // arr[3]번째에 들어갈 값 찾기
//        // 그 값이 들어 있는 index 찾기 -- 8번 인덱스
//        minIdx = 3; // 최솟값 찾기
//        for (int j = 3; j < arr.length; j++) {
//            if (arr[minIdx] > arr[j]) minIdx = j;
//        }
//        temp = arr[3];
//        arr[3] = arr[minIdx];
//        arr[minIdx] = temp;
//        System.out.println(Arrays.toString(arr));





    }
}
