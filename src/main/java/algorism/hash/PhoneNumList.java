package algorism.hash;

import java.util.HashSet;

public class PhoneNumList {
    // phone_book의 길이는 1 이상 1000000 이하
    // 각 전화번호의 길이는 1 이상 20 이하
    // 같은 전화번호가 중복해서 들어있지 않음
    // 힌트 - indexOf() 사용: 몇번째 인덱스에 해당 글자가 등장하는지 리턴

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hs = new HashSet<>();

        for (var phoneNum : phone_book) hs.add(phoneNum);

        //

        for (String phoneNum : phone_book) {
            for (int i = 1; i < phoneNum.length(); i++) {
                if (hs.contains(phoneNum.substring(0, i))) {
                    return false;
                }
            }
        }

        return answer;
    }
}
