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
            i = getMenuSelectionItem(scanner);

            switch (i) {
                case 1: {
                    if (balance >= 50) {
                        boolean confirmationNeeded = getConfirmationNeededInput(scanner);

                        //2
                        payOut50PLN();

                        if (confirmationNeeded) {
                            printConfirmation();
                        }
                    } else {
                        insufficientFunds();
                    }
                    break;
                }
                case 2: {
                    printBalance();
                    break;
                }
                case 3: {
                    int wyplata = howMuchMoneyToPayout(scanner);

                    if (wyplata <= balance) {
                        boolean confirmationNeeded = getConfirmationNeededInput(scanner);

                        System.out.println("Wyplacam pieniadze " + wyplata + " PLN");
                        balance = balance - wyplata;

                        if (confirmationNeeded) {
                            printConfirmation();
                        }
                    } else {
                        insufficientFunds();
                    }
                    break;
                }
                case 4: {
                    printExitMessage();
                    break;
                }
                default: {
                    System.out.println("Niepoprawna wartosc. Prosze wybrac opcje 1-4");
                    break;
                }
            }
        }
        while (i != 4);
    }

    public static void printBalance() {
        System.out.println("Saldo wynosi:" + balance);
    }

    public static boolean getConfirmationNeededInput(Scanner scanner) {
        System.out.println("Czy chcesz wydrukowac potwierdzenie? \ttak - wcisnij 1, \tnie - wcisnij dowolny inny klawisz");
        return scanner.nextInt() == 1;
    }

    public static void printExitMessage() {
        System.out.println("Dziekujemy za skorzystanie z naszych uslug. Zapraszamy ponownie");
    }

    public static int getMenuSelectionItem(Scanner scanner) {
        System.out.println("Prosze, wybierz co chcesz zrobic:" +
                "\t1- Wyplata 50zl" +
                "\t2- Sprawdzenie salda konta" +
                "\t3- Wyplata gotowki" +
                "\t4- Zakoncz");
        return scanner.nextInt();
    }

    public static void payOut50PLN() {
        System.out.println("Wyplacam pieniadze 50 PLN");
        balance = balance - 50;
    }

    public static void printConfirmation() {
        System.out.println("Drukuje potwierdzenie. Saldo wynosi:" + balance);
    }

    public static void insufficientFunds() {
        System.out.println("Brak wystarczajacych srodkow na koncie. Twoje saldo wynosi: " + balance);
    }

    public static int howMuchMoneyToPayout(Scanner scanner) {
        System.out.println("Jaka kwote chcesz wyplacic?");
        return scanner.nextInt();
    }

}

