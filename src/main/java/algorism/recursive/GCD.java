package algorism.recursive;

import java.io.*;
import java.util.StringTokenizer;

public class GCD {
    public static int gcd(int a, int b) {
        if (a % b == 0) return  b;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = 0;
        result = gcd(a, b);
        System.out.println(result);
    }
}
