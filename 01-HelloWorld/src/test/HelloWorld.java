package test;

public class HelloWorld {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }

        char a = 'A';
        System.out.println((int)a);
        boolean find = true;
        System.out.println(find);

        // 定义byte类型变量b，赋值为100
        byte b = 100;
        // 定义short类型变量s，赋值为1000
        short s = 1000;
        // 定义int类型变量i，赋值为10000
        int i = 10000;
        // 定义long类型变量l，赋值为100000
        long l = 100000L;
        // 定义float类型变量f，赋值为3.14
        float f = 3.14f;
        // 定义double类型变量d，赋值为3.1415926
        double d = 3.1415926;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println(d);


    }
}
