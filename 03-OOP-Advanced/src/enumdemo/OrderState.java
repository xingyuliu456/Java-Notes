package enumdemo;

public enum OrderState {
//    电商项目中，订单的状态只有以下6种，请编写代码实现。
//    待支付 PAYMENT_PENDING
//    处理中 PROCESSING
//    己发货 SHIPPED
//    配送中 OUT_FOR_DELIVERY
//    已送达 DELIVERED
//    已取消 CANCELLED

    PAYMENT_PENDING("待支付"),

    PROCESSING("处理中"),

    SHIPPED("已发货"),

    OUT_FOR_DELIVERY("配送中"),

    DELIVERED("已送达"),

    CANCELLED("已取消");

    private final String name;

    // 需要特别注意，只写一个构造器，且必须是私有的
    private OrderState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}