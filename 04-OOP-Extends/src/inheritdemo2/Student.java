package inheritdemo2;

public class Student {
    String name;
    int age;

    public Student() {
        // this()调用本类的其他构造方法
        this("同学", 18);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
