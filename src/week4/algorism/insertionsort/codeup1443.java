package week4.algorism.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class codeup1443 {
    public int[] sort(int[] arr){

        for(int i=1; i<arr.length; i++){
            System.out.println(i);
            for(int j=i; j>0; j--){
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if(arr[j] < arr[j-1]){
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        codeup1443 cd = new codeup1443();
        int[] result = cd.sort(arr);
        for(int value : result){
            System.out.println(value);
        }
    }
}
