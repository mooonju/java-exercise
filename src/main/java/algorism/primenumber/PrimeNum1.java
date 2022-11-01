package algorism.primenumber;

public class PrimeNum1 {

    // 13 17 19 23이 소수인지 판별하는 메소드
    boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i != 0) return false;
            System.out.printf("%d remainder: %d\n", i, num % i);
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNum1 pn = new PrimeNum1();
        pn.isPrime(13);
    }
}
