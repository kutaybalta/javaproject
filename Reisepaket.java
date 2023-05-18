public class Reisepaket {
    private String paketID;
    private String destination;
    private String datum;
    private int dauer;
    private int preis;

    public Reisepaket(String paketID, String destination, String datum, int dauer, int preis) {
        this.paketID = paketID;
        this.destination = destination;
        this.datum = datum;
        this.dauer = dauer;
        this.preis = preis;
    }

    public Reisepaket(String paketID) {
        this.paketID = paketID;
    }

    public String getPaketID() {
        return paketID;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Paket ID : " + paketID + "\nDatum - Destination : "
                + datum + " - " + destination + "\nDauer - Preis : " +
                dauer + " - $" + preis;
    }

    @Override
    public boolean equals(Object obj) {
        return (getPaketID().equals(((Reisepaket) obj).getPaketID()));
    }
}
