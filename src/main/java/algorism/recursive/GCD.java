package algorism.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {
    public static int gcd(int a, int b) {
        if (a % b == 0) return  b;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        int result = 0;
        result = gcd(196, 42);
        System.out.println(result);
    }
}
