package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        /*Consegna: creare un progetto java-festa-ferragnez con il package com.ferragnez.party, a cui aggiungere la classe CheckGuest
Nel programma bisogna:

creare e inizializzare l’array contenente i nomi degli invitati
chiedere all’utente come si chiama
verificare che il nome sia presente nella lista
(:ATTENZIONE: in Java per confrontare due stringhe non posso usare ==, ma devo usare il metodo equals(): esempio qui)
lasciarlo entrare o rispedirlo cortesemente da dove è venuto.
Bonus: se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa
*/
        String[] arrayInvitati = {"Marco", "Luca", "Alessia", "Giulia", "Matteo"};

        String nameOfUser;

        Scanner scan = new Scanner(System.in);


        System.out.println("come ti chiami?");
        nameOfUser = scan.nextLine();

        for (int i = 0; i < arrayInvitati.length; i++) {
            if (nameOfUser.equals(arrayInvitati[i])){
                System.out.println("puoi entrare");
            } else {}


        }
        scan.close();




    }

}
