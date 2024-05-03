package generator;

import java.security.SecureRandom;

public class Generator {

    private static final String GROSSBUCHSTABEN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String KLEINBUCHSTABEN = "abcdefghijklmnopqrstuvwxyz";
    private static final String ZAHLEN = "0123456789";
    private static final String SONDERZEICHEN = "!@#$%^&*()-_=+";

    public static String generierePasswort(PasswortgeneratorOptionen optionen) {
        StringBuilder passwortBuilder = new StringBuilder();

        SecureRandom random = new SecureRandom();

        if(optionen.isBeinhaltetGroßbuchstaben()) {
            passwortBuilder.append(GROSSBUCHSTABEN);
        }
        if(optionen.isBeinhaltetKleinbuchstaben()) {
            passwortBuilder.append(KLEINBUCHSTABEN);
        }
        if(optionen.isBeinhaltetZahlen()) {
            passwortBuilder.append(ZAHLEN);
        }
        if(optionen.isBeinhaltetSonderzeichen()) {
            passwortBuilder.append(SONDERZEICHEN);
        }

        StringBuilder passwort = new StringBuilder();
        for (int i = 0; i < optionen.getLaenge() ; i++) {
            int zufallsIndex = random.nextInt(passwortBuilder.length());
            passwort.append(passwortBuilder.charAt(zufallsIndex));
        }
        return passwort.toString();
    }
}
