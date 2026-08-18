package studentmanager;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("张三", "zhangsan", "123456");
        Teacher tea = new Teacher("李四", "lisi", "654321");
        Admin adm = new Admin("王五", "wangwu", "111111");

        StudentManager sm = new StudentManager();
        sm.register(stu);
        sm.register(tea);
        sm.register(adm);
    }
}
