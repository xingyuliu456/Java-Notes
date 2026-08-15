package rewritedemo2;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        Tablet tl = new Tablet();
        Laptop lp = new Laptop();

        p.name = "iPhone";
        p.price = 1000;
        tl.name = "iPad";
        tl.price = 4000;
        lp.name = "MacBook";
        lp.price = 8000;

        System.out.println(p.name + "的价格为: " + p.payment());
        System.out.println(tl.name + "的价格为: " + tl.payment());
        System.out.println(lp.name + "的价格为: " + lp.payment());
    }
}
