package algorism.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {

    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
//      int[] arr= stack01.push(10);
        stack01.push(10);
        stack01.push(20);

        int[] arr= stack01.getArr();
        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(20, arr[1]);
    }

    @Test
    @DisplayName("push가 잘되는지 pop이 잘되는지")
    void pushAndPop() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        assertEquals(20, stack01.pop());
        assertEquals(10, stack01.pop());

        stack01.push(30);
        assertEquals(30, stack01.pop());
    }
}