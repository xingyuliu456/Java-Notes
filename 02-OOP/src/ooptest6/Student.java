package ooptest6;

public class Student {
    private String name;
    private int age;

    public void study() {
        int age = 10;
        System.out.println("age = " + age);
        System.out.println("this.age = " + this.age);
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
