package rewritedemo1;

public class Test {
    public static void main(String[] args) {
        FirstGenerationPhone p1 = new FirstGenerationPhone();
        SecondGenerationPhone p2 = new SecondGenerationPhone();
        ThirdGenerationPhone p3 = new ThirdGenerationPhone();

        p1.call();
        System.out.println("----------------");
        p2.call();
        p2.sendMessage();
        System.out.println("----------------");
        p3.call();
        p3.sendMessage();
        p3.playGame();
    }
}
