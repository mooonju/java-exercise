package day2;

public class RandomCalculator {
    private int randomInt;
    private NumberCreator random;

    public RandomCalculator(NumberCreator random) {
        this.randomInt = random.randomNumberCreator();
    }

    public void plus(int a){
        System.out.println(a + randomInt);
    }
    public void minus(int a){
        System.out.println(a - randomInt);
    }
    public void multiple(int a){
        System.out.println(a * randomInt);
    }
    public void divide(int a){
        if(randomInt == 0){
            System.out.println("에러");
        } else {
            System.out.println((float) a / randomInt);
        }
    }
}
