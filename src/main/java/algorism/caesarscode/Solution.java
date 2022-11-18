package algorism.caesarscode;

public class Solution {
    // 시저 암호
    // https://school.programmers.co.kr/learn/courses/30/lessons/12926
    // 알파벳과 숫자를 입력받아 해당하는 숫자만큼 밀어내기
    // ab, 1 -> bc
    // ab, 3 -> de
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>='a' && ch<='z') {
                if (ch+n > 'z') {
                    answer += (char) (ch-26+n);
                } else {
                    answer += (char) (ch + n);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String answer = sol.solution("a", 5);
        System.out.println(answer);
    }
}
