package studentmanager;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("Teacher is teaching");
    }
}
