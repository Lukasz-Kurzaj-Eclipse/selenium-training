public class KeywordTest {

    private String name;
    private int age;

   public KeywordTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public KeywordTest() {
        printInstance(this);
    }

    public void printInstance(KeywordTest thisKeyword) {
        System.out.println(thisKeyword);
    }
}