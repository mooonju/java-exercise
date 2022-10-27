package algorism.hash;

import java.util.HashMap;
import java.util.Map;

public class HashAlgorism {

    // completion에 들어있는 이름을 key로 hashmap에 저장
    // 있으면 0
    // memo를 1바퀴 돌며 1인 값 찾기
    // 1명인 key return
    // 동명이인 처리

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> memo = new HashMap<>();
        for (String member : participant) {
            memo.put(member, memo.getOrDefault(member, 0) + 1);
        }

        for (String member : completion) {
            memo.put(member, memo.getOrDefault(member, 0) -1);
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
