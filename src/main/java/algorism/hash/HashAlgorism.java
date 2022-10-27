package algorism.hash;

import java.util.HashMap;
import java.util.Map;

public class HashAlgorism {

    // completion에 들어있는 이름을 key로 hashmap에 저장
    // 있으면 0
    // memo를 1바퀴 돌며 1인 값 찾기
    // 1명인 key return
    // 동명이인 처리 불가

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, 0);
        }

        for (String key : memo.keySet()) {
            if (memo.get(key) == 1)
                return key;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        HashAlgorism ha = new HashAlgorism();
        ha.solution(part, comp);
    }


}
