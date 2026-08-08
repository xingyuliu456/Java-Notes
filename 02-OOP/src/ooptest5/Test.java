package ooptest5;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        Student s2 = new Student("李四", 22);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }

}
