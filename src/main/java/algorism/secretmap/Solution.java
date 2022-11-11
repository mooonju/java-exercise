package algorism.secretmap;

public class Solution {
    // 비밀 지도
    // https://school.programmers.co.kr/learn/courses/30/lessons/17681

    public String[] solution(int n, int[] arr1, int[] arr2) {
        // int n 지도 길이
        // arr1 첫번째 지도
        // arr2 두번째 지도
        String[] map = new String[n];

        for (int i = 0; i < n; i++) {
            //
            for (int j = 0; j < n; j++) {
                // arr1 arr2 지도 비교해서 안 겹치는 부분 # 처리
            }
        }

        String[] answer = {};

        return answer;
    }

    // 10진수를 2진수로 변환
    String getBinaryString(int n) {
        String answer = "";
        while (n > 0) {
            answer += n % 2; // String + int = String
            n = n / 2;

        }
        return answer;
    }

}
