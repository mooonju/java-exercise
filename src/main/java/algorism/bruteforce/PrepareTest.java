package algorism.bruteforce;

import java.util.Arrays;

public class PrepareTest {
//    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

//    answer 1, 2, 3, 4, 5 | 1, 3, 2, 4, 2
//    1번 5문제 2문제
//    2번 0문제 2문제
//    3번 0문제 2문제
    public int[] solution(int[] answer) {

        int[] student1 = {1, 2, 3, 4, 5}; // 답이 5개 반복
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8개 반복
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10개 반복
        int[] score = {0, 0, 0};

        // 나머지 이용해서 루프
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == student1[i%5]) {
                score[0]++;
            }
            if (answer[i] == student2[i%8]) {
                score[1]++;
            }
            if (answer[i] == student3[i%10]) {
                score[2]++;
            }
        }

        System.out.println(Arrays.toString(score));

        // 문제 2
        // [5, 0, 0] -> [1]
        // [2, 2, 2] -> [1, 2, 3] 동점일 경우 전부 리턴



        return new int[0];
    }

    public static void main(String[] args) {
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {1, 3, 2, 4, 2};
        PrepareTest pt = new PrepareTest();
        pt.solution(answer1);
        pt.solution(answer2);

    }
}
