package week5.algorism;

public class SquareStar {
    public void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public void printRectangle(int x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        squareStar.printSquare(4);
        squareStar.printRectangle(5,3);
    }
}
