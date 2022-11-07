package algorism.harshadnumber;

public class HarshadNum {
    public boolean solution(int x) {
        boolean answer = true;
        // 자릿수의 합 더하기
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        // 자릿수의 합과 자연수 나누기
        if (x%sum == 0) {
            return answer;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        HarshadNum hn = new HarshadNum();
        boolean i = hn.solution(13);
        System.out.println(i);
    }

}
