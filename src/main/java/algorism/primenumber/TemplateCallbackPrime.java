package algorism.primenumber;

public class TemplateCallbackPrime {

    boolean someOperation(int a, int b) {
        return a < b;
    }

    boolean isPrime(int num) {
        // i < num
        // i < num / 2
        // i * i < num // while 루프 돌 때 루트로..
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean r = tcp.isPrime(17);
        System.out.println(r);
    }
}
