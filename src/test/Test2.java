package test;

public class Test2 {
    public static void main(String[] args) {
        // 寻找是不是7的有缘数
        int x = 72;
        int ge = x % 10;
        int shi = x / 10;
        if(ge == 7 || shi == 7 || x % 7 == 0) {
            System.out.println("这是一个7的有缘数！");
        } else {
            System.out.println("这不是一个7的有缘数。");
        }
    }
}
