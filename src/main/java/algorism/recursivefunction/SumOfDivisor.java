package algorism.recursivefunction;

public class SumOfDivisor {
    // 약수의 합
    // https://school.programmers.co.kr/learn/courses/30/lessons/12928
    public int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if (Math.floorMod(num, i) == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
