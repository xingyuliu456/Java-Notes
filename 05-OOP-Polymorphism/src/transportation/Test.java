package transportation;

public class Test {
    public static void main(String[] args) {

        Person p = new Person("Alice", 30, "Female");
        Vehicle v1 = new Bicycle("Schwinn", 15);
        Vehicle v2 = new Car("Toyota", 60);

        p.drive(v1); // Alice is using Schwinn to transport.
        p.drive(v2); // Alice is using Toyota to transport.
    }
}
