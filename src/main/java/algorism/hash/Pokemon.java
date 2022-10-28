package algorism.hash;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    public int solution(int[] nums) {
        // 중복을 제거하기 위해 set 사용
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int N = nums.length / 2;

        // set의 개수와 N 중에서 하나를 return
        if (set.size() < N) {
            return set.size();
        } else {
            return N;
        }
    }

    public int solution2(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int pickNum = nums.length / 2;

        if (pickNum > set.size()) {
            answer = set.size();
        } else {
            answer = pickNum;
        }
        return answer;
    }
}
