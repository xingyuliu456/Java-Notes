package inheritdemo3;

public class MajorTeacher extends Teacher {
    public MajorTeacher() {
    }

    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    // 重写教学方法
    @Override
    public void teaching() {
        System.out.println("教授专业课程");
    }
}
