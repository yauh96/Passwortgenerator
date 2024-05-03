package controller;

import generator.Generator;
import generator.PasswortAnforderungPrüfer;
import generator.PasswortgeneratorOptionen;

import java.util.Scanner;

public class Controller {

    public void startGenerator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie lang soll das Passwort sein?");
        int laenge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Soll das Passwort Großbuchstaben beinhalten? (ja/nein)");
        boolean großbuchstaben = scanner.nextLine().equalsIgnoreCase("ja");

        System.out.println("Soll das Passwort Kleinbuchstaben beinhalten? (ja/nein)");
        boolean kleinbuchstaben = scanner.nextLine().equalsIgnoreCase("ja");

        System.out.println("Soll das Passwort Zahlen behinhalten? (ja/nein)");
        boolean zahlen = scanner.nextLine().equalsIgnoreCase("ja");

        System.out.println("Soll das Passwort Sonderzeichen behinhalten? (ja/nein)");
        boolean sonderzeichen = scanner.nextLine().equalsIgnoreCase("ja");

        PasswortgeneratorOptionen optionen = new PasswortgeneratorOptionen(laenge, großbuchstaben, kleinbuchstaben, zahlen, sonderzeichen);

        String passwort = "";

        if (PasswortAnforderungPrüfer.genügtMindestAnforderungen(passwort, optionen)) {
            passwort = Generator.generierePasswort(optionen);
            System.out.println("Passwort: " + passwort);
        } else {
            System.out.println("Du musst mindestens 3 Optionen auswählen!");
        }


        scanner.close();
    }
}
