package week4.algorism;

public class Max04 {
    /*
        코드만 봐서 유추가 힘든 경우 주석 달기
        return: maxValue, maxIdx
     */
    public int[] getMax(int[] arr){
        // 비교할 변수 선언
        // arr이 모두 음수인 경우 0으로 하면 0이 max이기 때문에
        // arr[0]으로 초기화

        int maxIdx = 0;
        int maxValue = arr[0];
        // arr[0]과 arr[1]부터 비교할 수 있도록 i = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public static void main(String[] args) {
        // arr 선언
        int[] arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};
        // loop 구성 (전체 순회)
        Max04 max04 = new Max04();
        int[] result = max04.getMax(arr);
        // 테스트 코드
        if(result[0] == -3 && result[1] == 0){
            System.out.println("테스트 통과");
        }else{
            System.out.println("테스트 실패 result: " + result);
        }


    }
}
