package transportation;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand, int speed) {
        super(brand, speed);
    }

    public void honk() {
        System.out.println("Car is honking!");
    }

    @Override
    public void move() {
        System.out.println(getBrand() + "品牌的汽车正在以" + getSpeed() + "公里/小时的速度行驶。");
    }
}
