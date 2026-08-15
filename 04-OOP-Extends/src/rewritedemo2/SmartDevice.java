package rewritedemo2;

public class SmartDevice {
    /*
    某电商项目售卖智能设备，智能设备包括:手机，笔记本电脑，平板。1，所有的智能设备有以下属性:商品名，商品价格行为:计算商品总价格:
    [0~1000)元，不打折
    [1000~5000)元，9折
    [5000~10000)元，8折
    10000元及以上，7折
    2，手机享受额外补贴，在原有的基础上基础打9折。
    3.笔记本电脑和平板电脑没有不享受额外补贴。
     */

    String name;
    double price;

    public double payment() {
        if(price >= 0 && price < 1000) return price;
        else if(price >= 1000 && price < 5000) return price * 0.9;
        else if(price >= 5000 && price < 10000) return price * 0.8;
        else if(price >= 10000) return price * 0.7;
        else return 0;
    }
}
