package test_static;

public class Student {
    String name;
    int age;
    static String teacherName;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", Teacher: " + teacherName);
    }
}
