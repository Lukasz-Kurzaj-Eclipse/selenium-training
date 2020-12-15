import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class RandomGenerator {
    private static int currentInteger;
    private static int randomIntegersAmount;
    //private final Object RandomGenerator;

    private Instant dateOfTheDraw;
    private int drawnNumber;


    //Constructors

    public RandomGenerator(Instant dateOfTheDraw) {

        this.dateOfTheDraw = dateOfTheDraw;
    }

    public RandomGenerator(int drawnNumber) {

        this.drawnNumber = drawnNumber;
    }

    public RandomGenerator(Instant dateOfTheDraw, int drawnNumber) {

RandomGenerator.currentInteger = drawnNumber;
RandomGenerator.randomIntegersAmount = randomIntegersAmount+1;
        this.dateOfTheDraw = dateOfTheDraw;
        this.drawnNumber = drawnNumber;
    }

    RandomGenerator() {
    }

    // methods
    public void setDateOfTheDraw(Instant dateOfTheDraw) {
        this.dateOfTheDraw = dateOfTheDraw;
    }

    public void setDrawnNumber(int drawnNumber) {
        this.drawnNumber = drawnNumber;
    }

    public void setCurrentInteger(int currentInteger) {
    }

    public void setRandomIntegersAmount(int randomIntegersAmount) {
    }
    public Instant getDateOfTheDraw() {
        return dateOfTheDraw;
    }

    public int getDrawnNumber() {
        return drawnNumber;
    }
    public int getCurrentInteger() {
        return currentInteger;
    }

    public int getRandomIntegersAmount() {
        return randomIntegersAmount;
    }

    public static void main(String[] args) {

        RandomGenerator firstRandomGenerator = new RandomGenerator(Instant.now(), 6);
        RandomGenerator secondRandomGenerator = new RandomGenerator(Instant.now(), 12);
        //RandomGenerator thirdRandomGenerator = new RandomGenerator("2020-12-03",45);
       // RandomGenerator fourthRandomGenerator = new RandomGenerator("2020-12-09",55);
        //RandomGenerator fifthRandomGenerator = new RandomGenerator("2020-12-11", 12);
        //RandomGenerator sixthRandomGenerator = new RandomGenerator("2020-12-09", 5);
        printAll();

    }

    public static void printAll(){
        System.out.println(RandomGenerator.currentInteger);
        System.out.println(RandomGenerator.randomIntegersAmount);
    }
}
