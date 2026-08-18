package transportation;

public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(String brand, int speed) {
        super(brand, speed);
    }

    public void ringBell() {
        System.out.println("Bicycle is ringing the bell!");
    }

    @Override
    public void move() {
        System.out.println(getBrand() + "品牌的自行车正在以" + getSpeed() + "公里/小时的速度行驶。");
    }
}
