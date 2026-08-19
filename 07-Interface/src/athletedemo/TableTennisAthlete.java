package athletedemo;

public class TableTennisAthlete extends Athlete implements English {
    public TableTennisAthlete() {
    }

    public TableTennisAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning table tennis.");
    }

    @Override
    public void speakEnglish() {
        System.out.println(getName() + " is speaking English.");
    }
}
