package algorism.stack;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0; // -1을 넣어서 empty 상태 표현해도 됨

    public Stack01() { } // 기본 생성자

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer ++;
        // return arr; // 값을 arr 넣어서 리턴
    }

    public int pop() {
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    } // 리턴이 끝나고 pointer-- 불가능

    // array를 받아와야 하지만 private 상태라서 생성
    public int[] getArr() {
        return arr;
    }

}
