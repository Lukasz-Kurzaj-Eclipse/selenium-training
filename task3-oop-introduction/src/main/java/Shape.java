import java.util.Scanner;

public class Shape {
    // fields
    double field;
    String color;
    int border;
    boolean confirmed;

    //Constructors
    Shape(double field) {
        this.field = field;
    }

    Shape(double field, String color) {
        this.field = field;
        this.color = color;
    }
     Shape(double field, String color,int border){
        this.field=field;
        this.color=color;
        this.border=border;
     }
     Shape(double field, String color, int border, boolean confirmed){
        this.field=field;
        this.color=color;
        this.border=border;
        this.confirmed=confirmed;
     }

     // methods
    void setField(double field){
        this.field= field;
    }
    double getField(){
        return field;
    }
    void setColor(String color){
        this.color= color;
    }
    String getColor(){
        return color;
    }
    void setBorder(int border){
        this.border= border;
    }
    int getBorder(){
        return border;
    }
    void setConfirmed(boolean confirmed){
        this.confirmed= confirmed;
    }
    boolean getConfirmed(){
        return confirmed;
    }
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        Shape shape1= new Shape(4.3);
        shape1.setField(123.45);
        double currentField= shape1.getField();
        Shape shape2= new Shape(4.3, "white");
        Shape shape3= new Shape(43.0,"red",22);
        Shape shape4= new Shape(99.99, "blue", 9, true);
        return;

    }
}
