package homework.method;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
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

        int max, min;
        max = Max(arr);
        min = Min(arr);
        int sum = Sum(arr);

        double avg = (sum - max - min) / 3.0;

        System.out.println(avg);
    }

    public static int Max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int Min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
