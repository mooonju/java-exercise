package algorism.bruteforce;

public class PrepareTest {
//    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//    2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//    3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

//    answer 1, 2, 3, 4, 5 | 1, 3, 2, 4, 2
//    1번 5문제 2문제
//    2번 0문제 2문제
//    3번 0문제 2문제
    public int[] solution(int[] answer) {

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};


        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == student1[i%5]) {
                score[0]++;
            }
        }


        return new int[0];
    }

    public static void main(String[] args) {

    }
}
