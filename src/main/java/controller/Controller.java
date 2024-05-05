package controller;

import generator.Generator;
import generator.PasswortAnforderungPrüfer;
import generator.PasswortgeneratorOptionen;

import java.util.Scanner;

public class Controller {

    private final Scanner scanner;

    public Controller() {
        this.scanner = new Scanner(System.in);
    }

    public void startGenerator() {

        while (true) {
            System.out.println("Wie lang soll das Passwort sein? (mind. 8 Zeichen)");
            int laenge = passwortMindestanforderung();

            System.out.println("Soll das Passwort Großbuchstaben beinhalten? (ja/nein)");
            boolean großbuchstaben = getBooleanInput();

            System.out.println("Soll das Passwort Kleinbuchstaben beinhalten? (ja/nein)");
            boolean kleinbuchstaben = getBooleanInput();

            System.out.println("Soll das Passwort Zahlen behinhalten? (ja/nein)");
            boolean zahlen = getBooleanInput();

            System.out.println("Soll das Passwort Sonderzeichen behinhalten? (ja/nein)");
            boolean sonderzeichen = getBooleanInput();

            PasswortgeneratorOptionen optionen = new PasswortgeneratorOptionen(laenge, großbuchstaben, kleinbuchstaben, zahlen, sonderzeichen);

            if(PasswortAnforderungPrüfer.genügtMindestAnforderungen("", optionen)) {
                String passwort = Generator.generierePasswort(optionen);
                System.out.println("Passwort:" + passwort);
                break;
            } else {
                System.out.println("Du musst mindestens 3 Optionen auswählen!");
            }
        }
        scanner.close();
    }

    private int passwortMindestanforderung() {
        int laenge = 0;
        while (true) {
            String input = scanner.nextLine();
            try {
                laenge = Integer.parseInt(input);
                if (laenge < 8) {
                    System.out.println("Das Passwort muss mindestens 8 Zeichen lang sein:");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Länge. Bitte geben Sie eine ganze Zahl ein:");
            }
        }
        return laenge;
    }

    private boolean getBooleanInput() {
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("ja")) {
                return true;
            } else if (input.equals("nein")) {
                return false;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie 'ja' oder 'nein' ein:");
            }
        }
    }
}
