package algorism.hw1021;

import algorism.hw1020.Solution;

import java.util.Scanner;
import java.util.Stack;

public class codeup_3129 {

    public boolean solution(String s) {

        Stack<Character> st = new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                if ('(' == s.charAt(i)) {
                    st.push(s.charAt(i));
                } else if (')' == s.charAt(i)) {
                    if (st.empty()) return false;
                    st.pop();
                }
            }
        } catch (Exception e) {
        }
        return st.empty();
    }

    public static void main(String[] args) {
        // 올바른 괄호 2
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        codeup_3129 cd = new codeup_3129();
        boolean isGood = cd.solution(s);
        if(isGood) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }

    }
}
