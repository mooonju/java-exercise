package algorism.primenumber;

import java.util.ArrayList;
import java.util.List;

public class ArrayPrimeNum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // 2부터 50까지 리스트 생성
        for (int i = 2; i <= 50; i++) {
            list.add(i);
        }


        // 2를 제외한 2의 배수 제외
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0 && list.get(i) > 2) list.remove(i);
        }

        System.out.println(list);
        System.out.println(list.size());
    }
}
