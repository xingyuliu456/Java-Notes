package method;

public class Test1 {
    public static void main(String[] args) {
        // 方法重载
        int a = 1;
        int b = 2;
        double c = 3.0;
        double d = 4.0;
        double sum1 = getSum(a, b);
        double sum2 = getSum(c, d);
        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static double getSum(int a, int b) {
        return a + b;
    }

    public static double getSum(int a, double b) {
        return a + b;
    }

    public static double getSum(double a, int b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }
}


