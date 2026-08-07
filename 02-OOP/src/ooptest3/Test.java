package ooptest3;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("小白");
        d.setAge(20);
        d.setAge(12);

        d.eating();
        System.out.println(d.getName());
        System.out.println(d.getAge());
    }

}
