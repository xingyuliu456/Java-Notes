package inheritdemo3;

public class Test {
    public static void main(String[] args) {
        // 创建一个UndergraduateStudent对象
        UndergraduateStudent s1 = new UndergraduateStudent("John", 20, "B");
        System.out.println(s1.getName() + " is " + s1.getAge() + " years old and in grade " + s1.getGrade());
        s1.eating(); // 调用继承自Person的方法
        s1.sleeping(); // 调用继承自Person的方法
        s1.studying(); // 调用UndergraduateStudent重写的方法
        System.out.println("-------------------");

        // 创建一个MasterStudent对象
        MasterStudent s2 = new MasterStudent("Alice", 25, "A");
        System.out.println(s2.getName() + " is " + s2.getAge() + " years old and in grade " + s2.getGrade());
        s2.eating(); // 调用继承自Person的方法
        s2.sleeping(); // 调用继承自Person的方法
        s2.studying(); // 调用MasterStudent重写的方法
        System.out.println("-------------------");

        // 创建一个MajorTeacher对象
        MajorTeacher t1 = new MajorTeacher("Bob", 40, "Mathematics");
        System.out.println(t1.getName() + " is " + t1.getAge() + " years old and teaches " + t1.getSubject());
        t1.eating(); // 调用继承自Person的方法
        t1.sleeping(); // 调用继承自Person的方法
        t1.teaching(); // 调用MajorTeacher重写的方法
        System.out.println("-------------------");

        // 创建一个GeneralEducationTeacher对象
        GeneralEducationTeacher t2 = new GeneralEducationTeacher("Charlie", 35, "History");
        System.out.println(t2.getName() + " is " + t2.getAge() + " years old and teaches " + t2.getSubject());
        t2.eating(); // 调用继承自Person的方法
        t2.sleeping(); // 调用继承自Person的方法
        t2.teaching(); // 调用GeneralEducationTeacher重写的方法
    }
}
