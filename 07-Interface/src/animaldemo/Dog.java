package animaldemo;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + "正在狗刨");
    }
}
