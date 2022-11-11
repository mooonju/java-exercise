package algorism.secretmap;

import java.util.Arrays;

public class Solution {
    // 비밀 지도
    // https://school.programmers.co.kr/learn/courses/30/lessons/17681


//    public String solution(int n, int[] arr1, int[] arr2) {
//        // int n 지도 길이
//        // arr1 첫번째 지도
//        // arr2 두번째 지도
//        String answer = "";
//        String[] sArr1 = new String[n];
//        String[] sArr2 = new String[n];
//        for (int i = 0; i < n; i++) {
//            // arr1
//            for (int j = 0; j < n; j++) {
//                String binStr1 = getBinaryString(arr1[i]);
//                String binStr2 = getBinaryString(arr2[i]);
//                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
//                sArr2[i] = "0".repeat(n - binStr2.length()) + getBinaryString(arr2[i]);
//            }
//        }
//        System.out.println(Arrays.toString(sArr1));
//        System.out.println(Arrays.toString(sArr2));
//
//        return answer;
//    }
//
//    // 10진수를 2진수로 변환
//    String getBinaryString(int n) {
//        String answer = "";
//        while (n > 0) {
//            answer += n % 2; // String + int = String
//            n = n / 2;
//
//        }
//        return answer;
//    }


    public String[] solution(int n, int[] arr1, int[] arr2)
    {
        String[] map = new String[n];

        for (int i = 0; i < n; i++)
        {
            int[] map1 = dec2bin(n, arr1[i]);
            int[] map2 = dec2bin(n, arr2[i]);

            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < n; j++)
            {
                builder.append((map1[j] | map2[j]) == 1 ? "#" : " ");
            }

            map[i] = builder.toString();
        }

        return map;
    }


    private int[] dec2bin(int n, int num)
    {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[n - i - 1] = num % 2;

            num /= 2;
        }

        return arr;
    }


}
