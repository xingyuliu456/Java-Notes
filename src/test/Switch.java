package test;

public class Switch {
    public static void main(String[] args) {
//        // case穿透
//        int number = 1;
//        switch (number) {
//            case 1:
//                System.out.println("一");
//            case 2:
//                System.out.println("二");
//            case 3:
//                System.out.println("三");
//            default:
//                System.out.println("没有这个星期");
//        }

//        // 演示case后面跟箭头语句的用法,不会有case穿透，自动break
//        int number = 1;
//        switch (number) {
//            case 1 -> System.out.println("一");
//            case 2 -> System.out.println("二");
//            case 3 -> System.out.println("三");
//            default -> System.out.println("没有这个星期");
//        }

        int num = 1;
        String str = switch(num) {
            case 1 -> "一";
            case 2 -> "二";
            case 3 -> "三";
            default -> "没有这个星期";
        };

        System.out.println(str);

        
    }
}
