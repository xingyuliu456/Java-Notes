package athletedemo;

public class TableTennisCoach extends Coach implements English {
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void train() {
        System.out.println(getName() + " is training table tennis athletes.");
    }

    @Override
    public void speakEnglish() {
        System.out.println(getName() + " is speaking English.");
    }
}
