package inheritdemo1;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("-------------------");
        Student s2 = new Student("Alice", 20, "一年级");
        System.out.println("-------------------");
        Teacher t1 = new Teacher();
        System.out.println("-------------------");
        Teacher t2 = new Teacher("Bob", 40, "Math");
    }
}
