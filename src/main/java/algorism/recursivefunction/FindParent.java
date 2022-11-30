package algorism.recursivefunction;

public class FindParent {
    // 부모가 같을때까지 부모를 찾으면서 한칸 올라갈때마다 +1을 하는 방식으로 거리를 구합니다
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        // a의 부모는
        int parentA = Math.floorDiv(3, 2);

        System.out.printf("parentA: %d", parentA);
    }
}
