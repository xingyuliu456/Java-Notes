package animaldemo;

public class Test {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Bunny", "White");
        Frog frog = new Frog("Froggy", "Green");
        Dog dog = new Dog("Buddy", "Brown");

        rabbit.eat();
        frog.eat();
        dog.eat();

        Swim[] swimmers = {frog, dog};
        for (Swim swimmer : swimmers) {
            swimmer.swim();
        }
    }
}
