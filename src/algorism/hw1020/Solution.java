package algorism.hw1020;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(0,3);
        System.out.println(result);
    }
}
