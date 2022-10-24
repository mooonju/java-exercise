package algorism.kth;

import java.util.Arrays;

public class KthNumSlice {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int j, k, l;
            j = commands[i][0];
            k = commands[i][1];
            l = commands[i][2];
            int[] sliceArr = Arrays.copyOfRange(array, j-1, k);
            Arrays.sort(sliceArr);
            answer[i] = sliceArr[l - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };
        KthNumSlice kthNumSlice = new KthNumSlice();
        int[] arr1 = kthNumSlice.solution(array, commands);
        System.out.println(Arrays.toString(arr1));
    }
}
