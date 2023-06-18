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

    public static boolean checkPaketID(String paketID) {
        if (paketID.length() != 4) {
            System.out.println("PackageID must contain 4 digits.");
            return false;
        }
        for (int i = 0; i < paketID.length(); i++) {
            if (!Character.isDigit(paketID.charAt(i))) {
                System.out.println("Please enter number only.");
                return false;
            }
        }
        return true;
    }

    public static boolean checkDatum(String datum) {
        if (datum.charAt(2) != '/' || datum.charAt(5) != '/' || datum.length() != 10) {
            System.out.println("False date format.");
            return false;
        }
        for (int i = 0; i < datum.length(); i++) {
            if (i == 2 || i == 5) {
                continue;
            }
            if (!Character.isDigit(datum.charAt(i))) {
                System.out.println("Please enter number only.");
                return false;
            }
        }
        int jahre = Integer.parseInt(datum.substring(6));
        boolean isLeapYear = jahre % 4 == 0 && (jahre % 100 != 0 || jahre % 400 == 0);
        if (jahre < 2023 || jahre > 2033) {
            System.out.println("Years must be between 2023 - 2033.");
            return false;
        }
        int monat = Integer.parseInt(datum.substring(3, 5));
        if (monat < 1 || monat > 12) {
            System.out.println("Please enter a valid month.");
            return false;
        }
        int tag = Integer.parseInt(datum.substring(0, 2));
        int checkTag;
        switch (monat) {
            case 4, 6, 9, 11 -> checkTag = 30;
            case 1, 3, 5, 7, 8, 10, 12 -> checkTag = 31;
            default -> checkTag = isLeapYear ? 29 : 28;
        }
        if (tag > checkTag || tag < 1) {
            System.out.println("Please enter a valid day.");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paket ID : " + paketID + "\nDate - Destination : "
                + datum + " - " + destination + "\nHow many days - Price : " +
                dauer + " - $" + preis;
    }

    @Override
    public boolean equals(Object obj) {
        return (getPaketID().equals(((Reisepaket) obj).getPaketID()));
    }
}
