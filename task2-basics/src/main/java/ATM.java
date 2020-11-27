import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static int balance = 1000;

    public static void main(String... args) {
        int i;
        do {
            i = getMenuSelectionItem();
            switch (i) {
                case 1: {
                    payOut(50);
                    break;
                }
                case 2: {
                    printBalance();
                    break;
                }
                case 3: {
                    int valueToPayOut = howMuchMoneyToPayout();
                    payOut(valueToPayOut);
                    break;
                }
                case 4: {
                    printExitMessage();
                    break;
                }
                default: {
                    printMessageInvalidMenuItemSelected();
                    break;
                }
            }
        }
        while (i != 4);
    }

    public static void printBalance() {
        System.out.println("Saldo wynosi:" + balance);
    }

    public static boolean getConfirmationNeededInput() {
        System.out.println("Czy chcesz wydrukowac potwierdzenie? \ttak - wcisnij 1, \tnie - wcisnij dowolny inny klawisz");
        return scanner.nextInt() == 1;
    }

    public static void printExitMessage() {
        System.out.println("Dziekujemy za skorzystanie z naszych uslug. Zapraszamy ponownie");
    }

    public static int getMenuSelectionItem() {
        System.out.println("Prosze, wybierz co chcesz zrobic:" +
                "\t1- Wyplata 50zl" +
                "\t2- Sprawdzenie salda konta" +
                "\t3- Wyplata gotowki" +
                "\t4- Zakoncz");
        return scanner.nextInt();
    }

    public static void printMessageInvalidMenuItemSelected(){
        System.out.println("Niepoprawna wartosc. Prosze wybrac opcje 1-4");
    }

    public static void payOut(int val){

        if (balance >= val) {
            boolean confirmationNeeded = getConfirmationNeededInput();

            System.out.println("Wyplacam pieniadze " + val + " PLN");
            balance = balance - val;

            if (confirmationNeeded) {
                printConfirmation();
            }
        } else {
            printMessageInsufficientFunds();
        }
    }

    public static void printConfirmation() {
        System.out.println("Drukuje potwierdzenie. Saldo wynosi:" + balance);
    }

    public static void printMessageInsufficientFunds() {
        System.out.println("Brak wystarczajacych srodkow na koncie. Twoje saldo wynosi: " + balance);
    }

    public static int howMuchMoneyToPayout() {
        System.out.println("Jaka kwote chcesz wyplacic?");
        return scanner.nextInt();
    }

}

