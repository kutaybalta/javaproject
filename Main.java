import java.util.ArrayList;
import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
        ArrayList<Kunde> kunden =new ArrayList<Kunde>();
        
        int operation = 0;
        while(operation != 100){
            System.out.println("Welche Operation moechten Sie durchfuehren?");
            System.out.println("  1- Mitarbeiter hinzufuegen");
            System.out.println("  2- Mitarbeiter auflisten");
            System.out.println("  3- Mitarbeiter Suchen");//
            System.out.println("  4- Kunde hinzufuegen");
            System.out.println("  5- Kunden auflisten");//
            System.out.println("  6- Kunden Suchen");
            System.out.println("  100 - Programm beenden");
            operation = scanner.nextInt();
            scanner.nextLine();

            if(operation == 1){ //Mitarbeiter Ekleme
                String bId = "";
                String name = "";
                String nachname = "";
                do{
                    System.out.println("Bitte geben Sie 7 Digit Buerger ID ein: ");
                    bId = scanner.nextLine();
                }while (!Person.checkBuergerID(bId));
                do{
                    System.out.println("Bitte geben Sie Name ein: ");
                    name = scanner.nextLine();
                }while (!Person.checkName(name));
                do{
                    System.out.println("Bitte geben Sie Nachname ein: ");
                    nachname = scanner.nextLine();
                }while (!Person.chechNachname(nachname));
                System.out.println("Bitte geben Sie Alter ein: ");
                int alter = scanner.nextInt(); scanner.nextLine();
                System.out.println("Bitte geben Sie Position ein: ");
                String position = scanner.nextLine();
                Mitarbeiter m = new Mitarbeiter(name,nachname,bId,alter,position);
                mitarbeiter.add(m);
            }
            else if (operation == 2){ //Mitarbeiter Yazdirma
                if (mitarbeiter.size() != 0){
                    for(int i = 0; i < mitarbeiter.size(); i++){
                        System.out.println("\n" + mitarbeiter.get(i) + "\n");
                    }
                }
                else{
                    System.out.println("Es gibt kein Mitarbeiter.");
                }
            }
            else if ( operation == 3){ //Mitarbeiter Arama
                if(mitarbeiter.size() == 0){
                    System.out.println("Es gibt kein Mitarbeiter");
                }
                else{
                    String checkID;
                    do {
                        System.out.println("Bitte geben Sie BuergerID ein: ");
                        checkID = scanner.nextLine();
                    }while (!Person.checkBuergerID(checkID));
                    int index = mitarbeiter.indexOf(new Mitarbeiter(checkID));
                    if (index == -1){
                        System.out.println("Person konnte nicht gefunden werden");
                    }else {
                        System.out.println("\n" + mitarbeiter.get(index) + "\n");
                    }
                }
            }
            else if (operation == 4){ //Kunde ekleme
                String bId = "";
                String name = "";
                String nachname = "";
                do{
                    System.out.println("Bitte geben Sie 7 Digit Buerger ID ein: ");
                    bId = scanner.nextLine();
                }while (!Person.checkBuergerID(bId));
                do{
                    System.out.println("Bitte geben Sie Name ein: ");
                    name = scanner.nextLine();
                }while (!Person.checkName(name));
                do{
                    System.out.println("Bitte geben Sie Nachname ein: ");
                    nachname = scanner.nextLine();
                }while (!Person.chechNachname(nachname));
                System.out.println("Bitte geben Sie Alter ein: ");
                int alter = scanner.nextInt(); scanner.nextLine();
                System.out.println("Haben Sie Führerschein? \ntrue or false");
                boolean hatFührerschein = scanner.nextBoolean();    
                Kunde k = new Kunde(name,nachname,bId,alter,hatFührerschein);
                kunden.add(k);
            }
            else if (operation == 5){ //Kunde yazrdirma
                if (kunden.size() != 0){
                    for(int i =0; i <kunden.size(); i++){
                        System.out.println("\n" + kunden.get(i) + "\n");
                    }
                }
                else{
                    System.out.println("Es gibt kein Kunden ");
                }
            } else if (operation == 6) { //Kunde arama
                if (kunden.size() == 0){
                    System.out.println("Es gibt kein Kunden");
                }
                else {
                    String checkID;
                    do {
                        System.out.println("Bitte geben Sie BuergerID ein: ");
                        checkID = scanner.nextLine();
                    }while (!Person.checkBuergerID(checkID));
                    int index = kunden.indexOf(new Kunde(checkID));
                    if (index == -1){
                        System.out.println("Person konnte nicht gefunden werden");
                    }else {
                        System.out.println("\n" + kunden.get(index) + "\n");
                    }
                }

            }

        }

    }

}