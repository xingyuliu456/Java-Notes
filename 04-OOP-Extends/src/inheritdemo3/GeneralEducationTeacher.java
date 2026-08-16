package inheritdemo3;

public class GeneralEducationTeacher extends Teacher {
    public GeneralEducationTeacher() {
    }

    public GeneralEducationTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    // 重写教学方法
    @Override
    public void teaching() {
        System.out.println("教授通识课程");
    }
}
