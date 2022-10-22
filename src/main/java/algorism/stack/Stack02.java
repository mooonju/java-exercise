package algorism.stack;

import java.util.EmptyStackException;

public class Stack02 {

    private  Integer[] arr;
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[10000];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 헌으면 arr[0] = 10
        this.arr[top] = value;
        this.top ++;
        // 한줄로 this.arr[top++] = value;
    }

    public int pop() {
        if (this.isEmpty()) {
//            throw new RuntimeException("스택이 비었습니다");
            throw new EmptyStackException();
        }
        return this.arr[--this.top]; // this.top = 2
    }

    public boolean isEmpty() {
        // 1. 비었을때 = True
        // 2. 값이 들어 있을 때 = False
        // 3. 값을 뺐을 때 = True
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return this.arr[this.top -1];
    }
}
