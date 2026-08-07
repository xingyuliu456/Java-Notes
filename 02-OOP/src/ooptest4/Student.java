package ooptest4;

public class Student {
//    在校学生有属性:姓名、年龄、身高、体重。
//    行为:学习。
//    实现以下需求
//    要求1:大一新生，张三，18岁，183cm，60kg，刚进大学努力学习。
//    要求2:大二期间张三体重增加了10kg
//    要求3:大三期间张三减肥成功，身高增加2cm，体重减少3kg
//    要求4:打印大学毕业之后，张三的所有信息

    private String name;
    private int age;
    private int height;
    private int weight;

    public Student() {
    }

    public Student(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}