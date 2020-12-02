import java.util.Scanner;

public class Rectangle {

    private static Scanner scanner = new Scanner(System.in);

    // fields
    private double length;
    private double width;

    private double field;
    private double circuit;
    private double diagonal;

    //Constructors
    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

        calculateProperties();
    }

    Rectangle() {
    }

    // methods
    public void setLength(double length) {
        this.length = length;
        this.calculateProperties();
    }

    public void setWidth(double width) {
        this.width = width;
        calculateProperties();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return this.length;
    }

    public double getField() {
        return this.field;
    }

    public double getCircuit() {
        return this.circuit;
    }

    public double getDiagonal() {
        return this.diagonal;
    }

    private void calculateField() {
        this.field = this.length * this.width;
    }

    private void calculateCircuit() {
        this.circuit = 2 * this.length + 2 * this.width;
    }

    private void calculateDiagonal() {
        this.diagonal = Math.sqrt(this.length * this.length + this.width * this.width);
    }

    void calculateProperties(){
        this.calculateCircuit();
        this.calculateField();
        this.calculateDiagonal();
    }

    public void printCircuit() {
        System.out.println("Circuit:" + this.circuit);
    }

    public void printField() {
        System.out.println("Field:" + this.field);
    }

    public void printDiagonal() {
        System.out.println("Diagonal:" + this.diagonal);
    }

    public static void main(String... args) {
        double length = getLengthValue();
        double width = getWidthValue();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.printCircuit();
        rectangle.printField();
        rectangle.printDiagonal();
        return;

    }

    public static double getLengthValue() {
        System.out.println("Please put the length of the rectangle");
        return scanner.nextDouble();
    }

    public static double getWidthValue() {
        System.out.println("Please put the width of the rectangle");
        return scanner.nextDouble();
    }
}