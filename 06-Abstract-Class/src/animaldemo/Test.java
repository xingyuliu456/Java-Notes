package animaldemo;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", "White");
        Dog dog = new Dog("Buddy", "Brown");

        System.out.println(cat.getName() + " is " + cat.getColor());
        cat.eat();
        cat.catchMouse();

        System.out.println(dog.getName() + " is " + dog.getColor());
        dog.eat();
        dog.lookHome();

        // Animal a = new Animal(); // This line will cause a compilation error because Animal is abstract
    }
}
