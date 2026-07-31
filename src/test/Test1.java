package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        x = sc.nextInt();
        if (x >= 1000 && x <= 9999) {
            int a = x / 1000;
            int b = (x / 100) % 10;
            int c = (x / 10) % 10;
            int d = x % 10;

            if (a == d && b == c) {
                System.out.println("这是一个回文数！");
            } else {
                System.out.println("这不是一个回文数。");
            }
        }
    }
}
