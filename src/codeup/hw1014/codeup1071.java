package codeup.hw1014;

import java.util.Scanner;

public class codeup1071 {
    public static void main(String[] args) {
        // 0 입력될 때까지 무한 출력하기1
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(String strs : arr){
            if(strs.equals("0")){
                break;
            }
            System.out.println(strs);
        }

    }
}
