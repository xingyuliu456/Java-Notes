package homework.method;

import java.util.Scanner;

import static homework.method.Test1.Max;
import static homework.method.Test1.Sum;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            while(true) {
                int tmp = sc.nextInt();
                if(tmp < 0 || tmp > 100) {
                    System.out.println("分数超出范围，需要重新输入");
                } else {
                    arr[i] = tmp;
                    break;
                }
            }
        }

        int pass = CountPass(arr);
        double pass_rate = pass / 10.0;

        int sum = Sum(arr);
        double avg = sum / 10.0;

        int max = Max(arr);

        System.out.println("pass_rate = " + pass_rate);
        System.out.println("avg = " + avg);
        System.out.println("max = " + max);
    }

    public static int CountPass(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 60) count++;
        }
        return count;
    }


}
