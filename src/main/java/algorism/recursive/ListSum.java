package algorism.recursive;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    // 재귀

    public static int sum(List<Integer> nums) {
        if (nums.isEmpty()) return 0; // 탈출 조건 nums가 비면 0 return
//        int last = nums.get(nums.size() - 1);
//        nums.remove(nums.size() - 1);
//        return last + sum(nums);
        return nums.get(nums.size() - 1) + sum(nums);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
    }
}
