package studentmanager;

public class Admin extends Person {
    public Admin() {
    }

    public Admin(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("Admin is managing");
    }
}
