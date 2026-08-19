package athletedemo;

public class BasketballCoach extends Coach {
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void train() {
        System.out.println(getName() + " is training basketball athletes.");
    }
}
