import java.util.ArrayList;
import java.util.Scanner;


class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
        ArrayList<Kunde> kunden =new ArrayList<Kunde>();
        
        int operation = 0;
        while(operation != 100){
            System.out.println("Which operation you want to run ?");
            System.out.println("  1- Add Worker");
            System.out.println("  2- List Workers");
            System.out.println("  3- Search Workers");//
            System.out.println("  4- Add Customer");
            System.out.println("  5- List Customers");//
            System.out.println("  6- Search Customers");
            System.out.println("  100 - End the program");
            operation = scanner.nextInt();
            scanner.nextLine();

            if(operation == 1){ //Add Worker
                String bId = "";
                String name = "";
                String nachname = "";
                do{
                    System.out.println("Please enter 7 digit BuergerID :");
                    bId = scanner.nextLine();
                }while (!Person.checkBuergerID(bId));
                do{
                    System.out.println("Please enter name : ");
                    name = scanner.nextLine();
                }while (!Person.checkName(name));
                do{
                    System.out.println("Please enter last name: ");
                    nachname = scanner.nextLine();
                }while (!Person.chechNachname(nachname));
                System.out.println("Please enter age: ");
                int alter = scanner.nextInt(); scanner.nextLine();
                System.out.println("Please enter position: ");
                String position = scanner.nextLine();
                Mitarbeiter m = new Mitarbeiter(name,nachname,bId,alter,position);
                mitarbeiter.add(m);
            }
            else if (operation == 2){ //List Workers
                if (mitarbeiter.size() != 0){
                    for(int i = 0; i < mitarbeiter.size(); i++){
                        System.out.println("\n" + mitarbeiter.get(i) + "\n");
                    }
                }
                else{
                    System.out.println("No workers found.");
                }
            }
            else if ( operation == 3){ //Search Workers
                if(mitarbeiter.size() == 0){
                    System.out.println("No workers found");
                }
                else{
                    String checkID;
                    do {
                        System.out.println("Please enter BuergerID :");
                        checkID = scanner.nextLine();
                    }while (!Person.checkBuergerID(checkID));
                    int index = mitarbeiter.indexOf(new Mitarbeiter(checkID));
                    if (index == -1){
                        System.out.println("Person cannot be found");
                    }else {
                        System.out.println("\n" + mitarbeiter.get(index) + "\n");
                    }
                }
            }
            else if (operation == 4){ //Add Customer
                String bId = "";
                String name = "";
                String nachname = "";
                do{
                    System.out.println("Please enter 7 digit BuergerID :");
                    bId = scanner.nextLine();
                }while (!Person.checkBuergerID(bId));
                do{
                    System.out.println("Please enter name : ");
                    name = scanner.nextLine();
                }while (!Person.checkName(name));
                do{
                    System.out.println("Please enter last name: ");
                    nachname = scanner.nextLine();
                }while (!Person.chechNachname(nachname));
                System.out.println("Please enter age: ");
                int alter = scanner.nextInt(); scanner.nextLine();
                System.out.println("Do you have a driver's license?\ntrue or false");
                boolean hatFührerschein = scanner.nextBoolean();    
                Kunde k = new Kunde(name,nachname,bId,alter,hatFührerschein);
                kunden.add(k);
            }
            else if (operation == 5){ //List Customers
                if (kunden.size() != 0){
                    for(int i =0; i <kunden.size(); i++){
                        System.out.println("\n" + kunden.get(i) + "\n");
                    }
                }
                else{
                    System.out.println("No customers found ");
                }
            } else if (operation == 6) { //Search Customers
                if (kunden.size() == 0){
                    System.out.println("No customers found");
                }
                else {
                    String checkID;
                    do {
                        System.out.println("Please enter BuergerID : ");
                        checkID = scanner.nextLine();
                    }while (!Person.checkBuergerID(checkID));
                    int index = kunden.indexOf(new Kunde(checkID));
                    if (index == -1){
                        System.out.println("Person cannot be found");
                    }else {
                        System.out.println("\n" + kunden.get(index) + "\n");
                    }
                }

            }

        }

    }

}