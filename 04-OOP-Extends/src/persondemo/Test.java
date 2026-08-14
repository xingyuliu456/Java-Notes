package persondemo;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.age = 20;
        s.grade = "一年级";
        System.out.println(s.name + " " + s.age + " " + s.grade);
        s.eat();
        s.study();

        System.out.println("-------------------");

        Teacher t = new Teacher();
        t.name = "李四";
        t.age = 30;
        t.subject = "数学";
        System.out.println(t.name + " " + t.age + " " + t.subject);
        t.eat();
        t.teach();
    }
}
