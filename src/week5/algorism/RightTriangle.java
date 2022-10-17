package week5.algorism;

public class RightTriangle {
    public void star(int num) {
        for (int i=0; i<num; i++){
            // for문을 하나 더 쓰고
            // println 말고 print, printf 등을 써서 한줄로 출력
            for (int j=0; j<=i; j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        /*
        *               i = 0 별이 1개
        * *             i = 1 별이 2개
        * * *           i = 2 별이 3개
        * * * *         i = 3 별이 4개
        */

        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.star(10);

    }
}
