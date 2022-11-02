package algorism.primenumber;

import java.util.ArrayList;
import java.util.List;

public class ArrayPrimeNum {

    public int solution(int N) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 2; i <= N; i++) nums.add(i);

        for (int j = 2; j * j <= N ; j++) {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) % j == 0 && nums.get(i) > j)
                    nums.remove(i);
            }
        }
        return nums.size();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 2부터 50까지 리스트 생성
        for (int i = 2; i <= 50; i++) {
            list.add(i);
        }
//       list.removeIf(i -> i%2 == 0); // 람다식 removeIf

        // 2를 제외한 2의 배수 제외
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 && list.get(i) > 2) list.remove(i);
        }

        // 3을 제외한 3의 배수 지우기
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0 && list.get(i) > 3) list.remove(i);
        }

        // 4를 제외한 4의 배수 지우기
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 4 == 0 && list.get(i) > 4) list.remove(i);
        }

        System.out.println(list);
        System.out.println(list.size());
    }
}
