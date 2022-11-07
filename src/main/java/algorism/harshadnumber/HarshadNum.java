package algorism.harshadnumber;

public class HarshadNum {
    public boolean solution(int x) {
        // 자릿수의 합 더하기
        int num = x;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        // 자릿수의 합과 자연수 나누기
        return x % sum == 0 ? true : false;
    }

    public static void main(String[] args) {
        HarshadNum hn = new HarshadNum();
        boolean i = hn.solution(11);
        System.out.println(i);
    }

}
