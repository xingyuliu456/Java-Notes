package athletedemo;

public class Test {
    public static void main(String[] args) {
        TableTennisAthlete athlete1 = new TableTennisAthlete("John", 25);
        System.out.println("Name: " + athlete1.getName() + ", Age: " + athlete1.getAge());
        athlete1.learn();
        athlete1.speakEnglish();

        TableTennisCoach coach1 = new TableTennisCoach("Mike", 40);
        System.out.println("Name: " + coach1.getName() + ", Age: " + coach1.getAge());
        coach1.train();
        coach1.speakEnglish();
        
        BasketballAthlete athlete2 = new BasketballAthlete("Alice", 22);
        System.out.println("Name: " + athlete2.getName() + ", Age: " + athlete2.getAge());
        athlete2.learn();
        
        BasketballCoach coach2 = new BasketballCoach("Bob", 45);
        System.out.println("Name: " + coach2.getName() + ", Age: " + coach2.getAge());
        coach2.train();
    }
}
