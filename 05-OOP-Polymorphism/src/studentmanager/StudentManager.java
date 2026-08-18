package studentmanager;

public class StudentManager {
    public void register(Person per) {
        // Registration logic here

        // 输出:姓名为张三的账户注册成功，账号zhangsan，密码123456
        System.out.println("姓名为" + per.getName() + "的账户注册成功，账号" + per.getUsername() + "，密码" + per.getPassword());
    }
}
