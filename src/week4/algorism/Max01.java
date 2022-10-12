package week4.algorism;

public class Max01 {

    public static void main(String[] args) {
        // 주어진 배열 안에서 최대값 구하기
        // arr 선언
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        // loop 구성 (전체 순회) _ 이런 문제들은 한번 싹 출력해보는게 좋음
        // 비교할 변수 선언
        int maxValue = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
    }
}
