package animaldemo;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish.");
    }

    public void catchMouse() {
        System.out.println(getName() + " is catching a mouse.");
    }
}
