package week4.algorism;

public class SumOfDigit {
    public int solution(int n){
        // % 연산 이용 몫, 나머지 구하기
        int answer = 0;
        while (n != 0){
            answer += n%10;
            n = n/10;

        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);

        if(result1 == 10){
            System.out.println("테스트 통과했습니다");
        } else {
            System.out.printf("테스트 실패 result:%d \n", result1);
        }
    }
}
