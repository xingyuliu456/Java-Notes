package electronicdemo;

public class Test {
    public static void main(String[] args) {
        Android a = new Android();
        a.brand = "华为";
        a.price = 3000;
        System.out.println(a.brand + " " + a.price);
        a.call();
        a.sendMessage();
        a.nfc();

        System.out.println("-------------------");

        IOS p = new IOS();
        p.brand = "苹果";
        p.price = 8000;
        System.out.println(p.brand + " " + p.price);
        p.call();
        p.sendMessage();

        System.out.println("-------------------");

        Laptop l = new Laptop();
        l.brand = "联想";
        l.price = 5000;
        System.out.println(l.brand + " " + l.price);
        l.coding();
    }
}
