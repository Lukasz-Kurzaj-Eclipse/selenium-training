import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ATM {
    private static int balance = 1000;

    public static void main(String... args) {


        Scanner scanner = new Scanner(System.in);

        int i;
        do {
            System.out.println("Prosze, wybierz co chcesz zrobic:" +
                    "\n1- Wyplata 50zl" +
                    "\n2- Sprawdzenie salda konta" +
                    "\n3- Wyplata gotowki" +
                    "\n4- Zakoncz");

            i = scanner.nextInt();

            switch (i) {
                case 1: {
                    if (balance >= 50) {
                        balance = balance - 50;

                        int potwierdzenie;

                        System.out.println("Czy chcesz wydrukowac potwierdzenie? \ntak - wcisnij 1, \nnie - wcisnij dowolny inny klawisz");
                        potwierdzenie = scanner.nextInt();

                        if (potwierdzenie == 1) {
                            System.out.println("Drukuje potwierdzenie. Saldo wynosi:" + balance);
                        }
                    } else {
                        System.out.println("Brak srodkow na koncie");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Saldo wynosi:" + balance);
                    break;
                }
                case 3: {
                    int wyplata;

                    System.out.println("Jaka kwote chcesz wyplacic?");

                    wyplata = scanner.nextInt();

                    if (wyplata <= balance) {
                        balance = balance - wyplata;

                        int potwierdzenie;

                        System.out.println("Czy chcesz wydrukowac potwierdzenie? \ntak - wcisnij 1, \nnie - wcisnij dowolny inny klawisz");
                        potwierdzenie = scanner.nextInt();

                        if (potwierdzenie == 1) {
                            System.out.println("Drukuje potwierdzenie. Saldo wynosi:" + balance);
                        }
                        else {
                        System.out.println("Brak wystarczjacych srodkow na koncie. Twoje saldo wynosi" + balance);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Dziekujemy za skorzystanie z naszych uslug. Zapraszamy ponownie");
                    break;
                }
                default: {
                    System.out.println("Niepoprawna wartosc. Prosze wybrac opcje 1-4");
                    break;
                }
            }
        }
        while (i != 4);
        return;

    }

    public void printBalance() {
        System.out.println("Saldo wynosi:" + balance);

    }
}
