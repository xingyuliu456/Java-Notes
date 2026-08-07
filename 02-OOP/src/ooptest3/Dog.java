package ooptest3;

public class Dog {
    private String name;
    private int age;

    public void eating() {
        System.out.printf("%d岁的%s，正在吃骨头\n", age, name);
    }

    public void setName(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }

    public void setAge(int value) {
        if(value >= 0 && value <= 15) {
            age = value;
        } else {
            System.out.println("年龄不合法");
        }
    }

    public int getAge() {
        return age;
    }
}


