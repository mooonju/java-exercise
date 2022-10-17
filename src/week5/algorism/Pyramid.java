package week5.algorism;

public class Pyramid {
    /*
            *
           * *
          * * *
         * * * *
     */


    public  void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.printStar(5);
    }
}
