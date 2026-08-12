package enumdemo;

public class Test {
    public static void main(String[] args) {
        // 创建对象的时候不能使用new关键字，直接使用枚举类名.枚举值即可
        OrderState o1 = OrderState.SHIPPED;
        switch(o1) {
            case PAYMENT_PENDING -> System.out.println("订单状态是：待支付");
            case PROCESSING -> System.out.println("订单状态是：处理中");
            case SHIPPED -> System.out.println("订单状态是：已发货");
            case OUT_FOR_DELIVERY -> System.out.println("订单状态是：配送中");
            case DELIVERED -> System.out.println("订单状态是：已送达");
            case CANCELLED -> System.out.println("订单状态是：已取消");
        }
    }
}
