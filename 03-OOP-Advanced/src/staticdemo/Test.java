package staticdemo;

public class Test {
    public static void main(String[] args) {
        Student.teacherName = "王老师"; // 通过类名调用（推荐）
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);

        System.out.println(s1.name + "的年龄是" + s1.age + "，老师是" + Student.teacherName);
        System.out.println(s2.name + "的年龄是" + s2.age + "，老师是" + Student.teacherName);

        s1.teacherName = "李老师"; // 通过对象调用（不推荐）
        System.out.println(s1.name + "的年龄是" + s1.age + "，老师是" + Student.teacherName);
        System.out.println(s2.name + "的年龄是" + s2.age + "，老师是" + Student.teacherName);
    }
}
