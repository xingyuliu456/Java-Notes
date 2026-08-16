package inheritdemo3;

public class UndergraduateStudent extends Student {
    public UndergraduateStudent() {
    }

    public UndergraduateStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
    // 重写学习方法
    @Override
    public void studying() {
        System.out.println("攻读学士学位");
    }
}
