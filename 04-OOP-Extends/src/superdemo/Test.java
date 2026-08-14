package superdemo;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu {
    String name = "Fu";
    String address = "南京";
}

class Zi extends Fu {
    String name = "Zi";

    public void show() {
        // 想要输出Zi
        System.out.println(name);
        System.out.println(this.name);

        System.out.println("-------------------");

        // 想要输出Fu
        System.out.println(super.name);

        System.out.println("-------------------");

        // 想要输出南京
        System.out.println(address); // 从局部位置开始往上找
        System.out.println(this.address); // 从本类成员位置开始往上找
        System.out.println(super.address); // 从父类成员位置开始往上找
    }
}
