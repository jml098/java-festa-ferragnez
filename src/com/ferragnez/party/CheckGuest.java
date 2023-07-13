package com.ferragnez.party;

import java.util.Scanner;

// State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi
// che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)
//Consegna: creare un progetto java-festa-ferragnez con il package com.ferragnez.party,
// a cui aggiungere la classe CheckGuest

//Nel programma bisogna:
//creare e inizializzare l’array contenente i nomi degli invitati
//chiedere all’utente come si chiama
//verificare che il nome sia presente nella lista
// (in Java per confrontare due stringhe non posso usare ==, ma devo usare il metodo equals())
// lasciarlo entrare o rispedirlo cortesemente da dove è venuto
// se avete usato il ciclo for per cercare il nome nella lista nella consegna base,
// implementare lo stesso programma usando il ciclo while, e viceversa
public class CheckGuestBonus {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] guestsList;

    public static void main(String[] args) {
        guestsList = new String[]{
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio", "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        System.out.println("Scegli quale metodo utilizzare: \n" +
                "-ForLoop (0)\n" +
                "-WhileLoopVersione1 (1)\n" +
                "-WhileLoopVersione2 (2)");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 0 -> checkWithFor();
            case 1 -> checkWithWhileVersion1();
            case 2 -> checkWithWhileVersion2();
            default -> System.out.println("Devi scegliere tra 0, 1 o 2");
        }
    }

    private static void checkWithFor() {

        boolean found = false;
        String name;

        System.out.print("Inserisci il tuo nome: ");
        name = scanner.nextLine().toLowerCase();

        for (int i = 0; i < guestsList.length; i++) {
            String guest = guestsList[i];

            if (guest.toLowerCase().equals(name)) {
                found = true;
                name = guest;
                break;
            }
        }

        if (found) {
            System.out.println("Benvenuto " + name + " e buon divertimento!");
        } else {
            System.out.println("Ci spiace ma non sei nella lista degli invitati.");
        }

    }
    private static void checkWithWhileVersion1() {

        String name;
        int i;

        System.out.print("Inserisci il tuo nome: ");
        name = scanner.nextLine().toLowerCase();

        i = 0;
        while (i < guestsList.length )  {
            String guest = guestsList[i];

            if (guest.toLowerCase().equals(name)) {
                break;
            } else i++;
        }

        if (i >= guestsList.length) {
            System.out.println("Ci spiace ma non sei nella lista degli invitati.");
        } else {
            System.out.println("Benvenuto " + guestsList[i] + " e buon divertimento!");
        }

    }
    private static void checkWithWhileVersion2() {

        String name;
        int i;

        System.out.print("Inserisci il tuo nome: ");
        name = scanner.nextLine().toLowerCase();

        i = 0;
        while (i < guestsList.length && !guestsList[i].toLowerCase().equals(name))  i++;

        if (i >= guestsList.length) {
            System.out.println("Ci spiace ma non sei nella lista degli invitati.");
        } else {
            System.out.println("Benvenuto " + guestsList[i] + " e buon divertimento!");
        }

    }

}
