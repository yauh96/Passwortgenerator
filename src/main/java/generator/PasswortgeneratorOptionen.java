package generator;

public class PasswortgeneratorOptionen {

    private int laenge;
    private boolean beinhaltetGroßbuchstaben;
    private boolean beinhaltetKleinbuchstaben;
    private boolean beinhaltetZahlen;
    private boolean beinhaltetSonderzeichen;

    public PasswortgeneratorOptionen(int laenge, boolean beinhaltetGroßbuchstaben, boolean beinhaltetKleinbuchstaben, boolean beinhaltetZahlen, boolean beinhaltetSonderzeichen) {
        this.laenge = laenge;
        this.beinhaltetGroßbuchstaben = beinhaltetGroßbuchstaben;
        this.beinhaltetKleinbuchstaben = beinhaltetKleinbuchstaben;
        this.beinhaltetZahlen = beinhaltetZahlen;
        this.beinhaltetSonderzeichen = beinhaltetSonderzeichen;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public boolean isBeinhaltetGroßbuchstaben() {
        return beinhaltetGroßbuchstaben;
    }

    public void setBeinhaltetGroßbuchstaben(boolean beinhaltetGroßbuchstaben) {
        this.beinhaltetGroßbuchstaben = beinhaltetGroßbuchstaben;
    }

    public boolean isBeinhaltetKleinbuchstaben() {
        return beinhaltetKleinbuchstaben;
    }

    public void setBeinhaltetKleinbuchstaben(boolean beinhaltetKleinbuchstaben) {
        this.beinhaltetKleinbuchstaben = beinhaltetKleinbuchstaben;
    }

    public boolean isBeinhaltetZahlen() {
        return beinhaltetZahlen;
    }

    public void setBeinhaltetZahlen(boolean beinhaltetZahlen) {
        this.beinhaltetZahlen = beinhaltetZahlen;
    }

    public boolean isBeinhaltetSonderzeichen() {
        return beinhaltetSonderzeichen;
    }

    public void setBeinhaltetSonderzeichen(boolean beinhaltetSonderzeichen) {
        this.beinhaltetSonderzeichen = beinhaltetSonderzeichen;
    }
}
