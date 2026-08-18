package studentmanager;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("Student is studying");
    }
}
