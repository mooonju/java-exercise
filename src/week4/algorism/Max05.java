package week4.algorism;

public class Max05 {
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
//        3, 23, 85, 34, 17, 74, 25, 52, 65
//        10, 7, 39, 42, 88, 52, 14, 72, 63
//        87, 42, 18, 78, 53, 45, 18, 84, 53
//        34, 28, 64, 85, 12, 16, 75, 36, 55
//        21, 77, 45, 35, 28, 75, 90, 76, 1
//        25, 87, 65, 15, 28, 11, 37, 28, 74
//        65, 27, 75, 41, 7, 89, 78, 64, 39
//        47, 47, 70, 45, 23, 65, 3, 41, 44
//        87, 13, 82, 38, 31, 12, 29, 29, 80
        // 4차원 배열
        int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };
        // loop 구성 (전체 순회)
        Max05 max04 = new Max05();
        // 테스트 코드
        if(true){
            System.out.println("테스트 통과");
        }else{
            System.out.println("테스트 실패 result: ");
        }


    }
}
