public class Car {
    public String honk() {
        return "beep!";
    }

    public String drive() {
        return "vroom";
    }
    interface Driveable {
        void honk();
        void drive();
    }

}

