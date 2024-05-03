package generator;

public class PasswortAnforderungPrüfer {

    public static boolean genügtMindestAnforderungen(String passwort, PasswortgeneratorOptionen optionen) {
        int erfüllteOptionen = 0;
        if (optionen.isBeinhaltetGroßbuchstaben()) erfüllteOptionen++;
        if (optionen.isBeinhaltetKleinbuchstaben()) erfüllteOptionen++;
        if (optionen.isBeinhaltetZahlen()) erfüllteOptionen++;
        if (optionen.isBeinhaltetSonderzeichen()) erfüllteOptionen++;

        return erfüllteOptionen >= 3;
    }
}
