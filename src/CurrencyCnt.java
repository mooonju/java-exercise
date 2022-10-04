public class CurrencyCnt {
    public static void main(String[] args) {

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;

        int refund = 25000;

        System.out.println("5만원권 %d\n" + refund / curr50000);
        System.out.println("만원권 %d\n" + refund / curr10000);
        System.out.println("5천원권 %d\n" + refund / curr5000);
        System.out.println("천원권 %d\n" + refund / curr1000);
        System.out.println("500원 %d\n" + refund / curr500);

    }
}
