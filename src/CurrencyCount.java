public class CurrencyCount {
    public static void main(String[] args) {
        // 현금으로 돈을 받고 25000원을 거슬러 주어야 합니다
        // 5만원짜리는 몇장 만원짜리는 몇장 5천원짜리는 몇장을 거슬러 주어야 할까요?

        int money = 25000;

        int[] array = {50000,10000,5000,1000,500,100,50,10};
        for(int i = 0; i<8;i++){
            System.out.println(array[i]+"원: "+(money/array[i])+"개");
            money=money%array[i];
        }
    }
}
