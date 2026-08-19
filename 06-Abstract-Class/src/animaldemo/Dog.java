package animaldemo;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating meat.");
    }

    public void lookHome() {
        System.out.println(getName() + " is looking home.");
    }
}
