package athletedemo;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning basketball.");
    }
}
