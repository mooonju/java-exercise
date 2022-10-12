package week4.algorism;

public class Max02 {
    // 리팩토링
    public int getMax(int[] arr){

        // 비교할 변수 선언
        int maxValue = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;

    }

    public static void main(String[] args) {
        // arr 선언
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        // loop 구성 (전체 순회)
        Max02 max02 = new Max02();
        int result = max02.getMax(arr);
        // 테스트 코드
        if(result == 85){
            System.out.println("테스트 통과");
        }else{
            System.out.println("테스트 실패 result: " + result);
        }


    }
}
