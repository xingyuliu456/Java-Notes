package inheritdemo3;

public class MasterStudent extends Student {
    public MasterStudent() {
    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    // 重写学习方法
    @Override
    public void studying() {
        System.out.println("攻读硕士学位");
    }

    @Override
    public void sleeping() {
        System.out.println("研究生宿舍升级，在豪华版公寓睡觉");
    }
}
