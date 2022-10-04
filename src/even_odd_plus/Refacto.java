package even_odd_plus;

import java.util.Scanner;

public class Refacto {

    public static String getEvenOdd(int num){
        // 숫자를 받아서 짝수면 "짝수" 홀수면 "홀수" 리턴
        if (num%2 == 0){
            return "짝수";
        } else {
            return "홀수";
        }
    }

    public static void main(String[] args) {
        /* 정수 두개가 입력으로 들어온다.
        만약 첫번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "+"를 출력한다.
        그리고 두번째 정수가 홀수이면 "홀수"를 출력하고, 짝수이면 "짝수"를 출력한 후  "="을 출력하고 
        결과로 나오는 값이 홀수인지 짝수인지 출력한다.*/

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int resultNum = firstNum + secondNum;

        String sFirstNum = getEvenOdd(firstNum);
//        System.out.print("+");
        String sSecondNum = getEvenOdd(secondNum);
//        System.out.print("=");
        String sResultNum = getEvenOdd(resultNum);
        System.out.printf("%s+%s=%s", sFirstNum, sSecondNum, sResultNum);
    }
}
