import java.util.Scanner;

public class Rectangle {

    //private static Scanner scanner = new Scanner(System.in);

    // fields
    double length;
    double width;
    double field;
    double circuit;
    double diagonal;

    //Constructors
    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

        this.circuit = this.calculateCircuit(this.length, this.width);
        this.field = this.calculateField(this.length, this.width);
        this.diagonal = this.calculateDiagonal(this.length, this.width);
    }

    Rectangle() {
    }

    // methods
    void setLenght(double length) {
        this.length = length;
    }

    double getLength() {
        return length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getWidth() {
        return width;
    }

    double calculateField(double length, double width) {
        this.field = length * width;
        return field;
    }

    double getField() {
        return field;
    }

    private double calculateCircuit(double length, double width) {
        this.circuit = 2 * length + 2 * width;
        return circuit;
    }

    double getCircuit() {
        return circuit;
    }

    double calculateDiagonal(double length, double width) {
        this.diagonal = Math.sqrt(length * length + width * width);
        return diagonal;
    }

    double getDiagonal() {
        return diagonal;
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
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double getWidthValue() {
        System.out.println("Please put the width of the rectangle");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
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
}