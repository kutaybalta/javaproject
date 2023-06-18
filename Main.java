import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
        ArrayList<Kunde> kunden = new ArrayList<Kunde>();
        ArrayList<Reisepaket> reisepaket = new ArrayList<Reisepaket>();

        int operation = 0;
        while (operation != 100) {
            System.out.println("Which operation do you want to perform?");
            System.out.println("  1- Add Employee");
            System.out.println("  2- List Employees");
            System.out.println("  3- Search Employees");
            System.out.println("  4- Add Customer");
            System.out.println("  5- List Customers");
            System.out.println("  6- Search Customers");
            System.out.println("  7- Add Travel Package");
            System.out.println("  8- List All Travel Packages");
            System.out.println("  9- Search Travel Package");
            System.out.println("  10- Change Travel Package Price");
            System.out.println("  11- Add Travel Package to Customer");
            System.out.println("  12- List Users All Travel Packages");
            System.out.println("  100 - End the program");

            try {
                operation = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid option: " + ime);
            }
            scanner.nextLine();
            String bId = "";
            String name = "";
            String nachname = "";
            int alter = 0;

            if (operation == 1) { // Add Employee
                do {
                    System.out.println("Please enter a 7-digit Citizen ID: ");
                    bId = scanner.nextLine();
                } while (!Person.checkBuergerID(bId));
                do {
                    System.out.println("Please enter a name: ");
                    name = scanner.nextLine();
                } while (!Person.checkName(name));
                do {
                    System.out.println("Please enter a last name: ");
                    nachname = scanner.nextLine();
                } while (!Person.chechNachname(nachname));
                System.out.println("Please enter an age: ");
                try {
                    alter = scanner.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid option: " + ime);
                    scanner.nextLine();
                    continue;
                }
                scanner.nextLine();
                System.out.println("Please enter a position: ");
                String position = scanner.nextLine();
                Mitarbeiter m = new Mitarbeiter(name, nachname, bId, alter, position);
                mitarbeiter.add(m);
            } else if (operation == 2) { // List Employees
                if (mitarbeiter.size() != 0) {
                    for (int i = 0; i < mitarbeiter.size(); i++) {
                        System.out.println("\n" + mitarbeiter.get(i) + "\n");
                    }
                } else {
                    System.out.println("No employees found.");
                }
            } else if (operation == 3) { // Search Employees
                if (mitarbeiter.size() == 0) {
                    System.out.println("No employees found.");
                } else {
                    String checkID;
                    do {
                        System.out.println("Please enter a Citizen ID: ");
                        checkID = scanner.nextLine();
                    } while (!Person.checkBuergerID(checkID));
                    int index = mitarbeiter.indexOf(new Mitarbeiter(checkID));
                    if (index == -1) {
                        System.out.println("Person cannot be found.");
                    } else {
                        System.out.println("\n" + mitarbeiter.get(index) + "\n");
                    }
                }
            } else if (operation == 4) { // Add Customer
                do {
                    System.out.println("Please enter a 7-digit Citizen ID: ");
                    bId = scanner.nextLine();
                } while (!Person.checkBuergerID(bId));
                do {
                    System.out.println("Please enter a name: ");
                    name = scanner.nextLine();
                } while (!Person.checkName(name));
                do {
                    System.out.println("Please enter a last name: ");
                    nachname = scanner.nextLine();
                } while (!Person.chechNachname(nachname));
                System.out.println("Please enter an age: ");
                try {
                    alter = scanner.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid option: " + ime);
                    scanner.nextLine();
                    continue;
                }
                System.out.println("Does Customer has a driver's license? (true or false)");
                boolean hatFührerschein = scanner.nextBoolean();
                Kunde k = new Kunde(name, nachname, bId, alter, hatFührerschein);
                kunden.add(k);
            } else if (operation == 5) { // List Customers
                if (kunden.size() != 0) {
                    for (int i = 0; i < kunden.size(); i++) {
                        System.out.println("\n" + kunden.get(i) + "\n");
                    }
                } else {
                    System.out.println("No customers found.");
                }
            } else if (operation == 6) { // Search Customers
                if (kunden.size() == 0) {
                    System.out.println("No customers found.");
                } else {
                    String checkID;
                    do {
                        System.out.println("Please enter a Citizen ID: ");
                        checkID = scanner.nextLine();
                    } while (!Person.checkBuergerID(checkID));
                    int index = kunden.indexOf(new Kunde(checkID));
                    if (index == -1) {
                        System.out.println("Person cannot be found.");
                    } else {
                        System.out.println("\n" + kunden.get(index) + "\n");
                    }
                }
            } else if (operation == 7) { // Add Travel Package
                String paketID;
                do {
                    System.out.println("Please enter a package ID: ");
                    paketID = scanner.nextLine();
                }while(!Reisepaket.checkPaketID(paketID));
                System.out.println("Please enter a destination: ");
                String destination = scanner.nextLine();
                String datum;
                do {
                    System.out.println("Please enter the date in the format DD/MM/YYYY: ");
                    datum = scanner.nextLine();
                }while(!Reisepaket.checkDatum(datum));
                int dauer = 0;
                int preis = 0;
                System.out.println("Please enter the duration in days: ");
                try {
                    dauer = scanner.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid option: " + ime);
                    scanner.nextLine();
                    continue;
                }
                try {
                    System.out.println("Please enter the price: ");
                    preis = scanner.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid option: " + ime);
                    scanner.nextLine();
                    continue;
                }

                Reisepaket r = new Reisepaket(paketID, destination, datum, dauer, preis);
                reisepaket.add(r);
            } else if (operation == 8) { // List All Travel Packages
                if (reisepaket.size() == 0) {
                    System.out.println("No travel packages found.");
                } else {
                    for (int i = 0; i < reisepaket.size(); i++) {
                        System.out.println("\n" + reisepaket.get(i) + "\n");
                    }
                }
            } else if (operation == 9) { // Search Travel Package
                if (reisepaket.size() == 0) {
                    System.out.println("No travel packages found.");
                } else {
                    System.out.println("Please enter the package ID: ");
                    String checkID = scanner.nextLine();
                    int index = reisepaket.indexOf(new Reisepaket(checkID));
                    if (index == -1) {
                        System.out.println("Travel package cannot be found.");
                    } else {
                        System.out.println("\n" + reisepaket.get(index) + "\n");
                    }
                }
            } else if (operation == 10) { // Change Travel Package Price
                if (reisepaket.size() == 0) {
                    System.out.println("No travel packages found.");
                } else {
                    System.out.println("Please enter the package ID you want to modify: ");
                    String checkID = scanner.nextLine();
                    int index = reisepaket.indexOf(new Reisepaket(checkID));
                    if (index == -1) {
                        System.out.println("Travel package cannot be found.");
                    } else {
                        int preis = 0;
                        try {
                            System.out.println("Please enter the new price: ");
                            preis = scanner.nextInt();
                        } catch (InputMismatchException ime) {
                            System.out.println("Please enter a valid option: " + ime);
                            scanner.nextLine();
                            continue;
                        }
                        reisepaket.get(index).setPreis(preis);
                    }
                }
            } else if (operation == 11) { // Add Travel Packages to a Customer
                if (reisepaket.size() == 0) {
                    System.out.println("No travel packages found.");
                }
                else if (kunden.size() == 0) {
                    System.out.println("No customers found.");
                }
                else {
                    System.out.println("PLease enter the package ID: ");
                    String checkID = scanner.nextLine();
                    String checkBID;
                    do {
                        System.out.println("Please enter a Citizen ID: ");
                        checkBID = scanner.nextLine();
                    }while(!Person.checkBuergerID(checkBID));
                    int index = reisepaket.indexOf(new Reisepaket(checkID));
                    int customerIndex = kunden.indexOf(new Kunde(checkBID));
                    if (index == -1) {
                        System.out.println("Travel package cannot be found.");
                    }
                    else if (customerIndex == -1) {
                        System.out.println("Person cannot be found.");
                    }
                    else {
                        kunden.get(customerIndex).setKundenPaketen(reisepaket.get(index));
                    }
                }
            } else if (operation == 12) { // List Customers Travel Packages
                if (kunden.size() == 0) {
                    System.out.println("No Customer found.");
                }
                else {
                    String checkBID;
                    do {
                        System.out.println("Please enter a Citizen ID: ");
                        checkBID = scanner.nextLine();
                    }while (!Person.checkBuergerID(checkBID));
                    int kundenIndex = kunden.indexOf(new Kunde(checkBID));
                    if (kundenIndex == -1){
                        System.out.println("Person cannot be found.");
                    }else {
                        if (kunden.get(kundenIndex).getKundenPaketen().size() == 0){
                            System.out.println("This Customer has no packages.");
                        }
                        else {
                            for (int i = 0; i < kunden.get(kundenIndex).getKundenPaketen().size(); i++){
                                System.out.println("\n" + kunden.get(kundenIndex).getKundenPaketen().get(i) + "\n");
                            }
                        }
                    }
                }
            }
             
            
        }
    }
}
