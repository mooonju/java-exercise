package algorism.primenumber;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {

//    boolean someOperation(int a, int b) {
//        return a < b;
//    } 인터페이스로 교체

    boolean isPrime(int num, StatementStrategy stmt) {
        // i < num
        // i < num / 2
        // i * i < num // while 루프 돌 때 루트로..
        for (int i = 2; stmt.compare(i, num); i++) {
            // System.out.println(i);
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        System.out.println(tcp.isPrime(13, (a, b) -> a < b));
        System.out.println(tcp.isPrime(17, (a, b) -> a < b / 2));
        System.out.println(tcp.isPrime(19, (a, b) -> a * a < b));
    }
}
