package test;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int[] ageArr1 = new int[]{18, 19, 20};
//        int[] ageArr2 = {18, 19, 20};
//
//        for (int i = 0; i < ageArr1.length; i++) {
//            System.out.println(ageArr1[i]);
//        }
//
//        System.out.println("----------");
//
//        for (int i = 0; i < ageArr2.length; i++) {
//            System.out.println(ageArr2[i]);
//        }
        
        // 动态初始化
        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
