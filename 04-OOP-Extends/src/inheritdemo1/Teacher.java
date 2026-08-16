package inheritdemo1;

public class Teacher extends Person {
    String subject;

    public Teacher() {
        System.out.println("子类Teacher空参构造执行");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("子类Teacher有参构造执行");
    }
}
