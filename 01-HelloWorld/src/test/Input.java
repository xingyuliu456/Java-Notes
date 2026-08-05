package test;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("num = " + num);

        double d = sc.nextDouble();
        System.out.println("d = " + d);

        // 读取字符串
        String str = sc.next();
        System.out.println("str = " + str);

    }
}
