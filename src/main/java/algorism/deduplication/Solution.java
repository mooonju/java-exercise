package algorism.deduplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    // 같은 숫자는 싫어
    // https://school.programmers.co.kr/learn/courses/30/lessons/12906
    // arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다
    // arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다

    public int[] solution(int []arr) {

        List<Integer> answerList = new ArrayList<>();
        answerList.add(arr[0]); // 핵심! array와 비교해야하기 때문
        for (int i = 1; i < arr.length; i++) {
            // list의 마지막 번째와 arr의 현재 값 비교
            if (answerList.get(answerList.size() - 1) != arr[i]) answerList.add(arr[i]);
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
