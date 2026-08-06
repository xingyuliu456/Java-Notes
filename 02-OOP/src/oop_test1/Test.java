package oop_test1;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Apple";
        phone1.color = "Black";
        phone1.price = 999.99;

        Phone phone2 = new Phone();
        phone2.brand = "Samsung";
        phone2.color = "White";
        phone2.price = 899.99;

        System.out.println("Phone 1: " + phone1.brand + ", " + phone1.color + ", $" + phone1.price);
        System.out.println("Phone 2: " + phone2.brand + ", " + phone2.color + ", $" + phone2.price);
    }
}
