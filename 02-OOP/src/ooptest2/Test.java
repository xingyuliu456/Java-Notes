package ooptest2;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.name = "zhangsan";
        w.age = 48;
        w.workAge = 30;

        System.out.println(w.name);
        System.out.println(w.age);
        System.out.println(w.workAge);
        w.working();
    }
}
