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
        //creo un array con la lista dei nomi degli invitati
        String[] arrayInvitati = {"Marco", "Luca", "Alessia", "Giulia", "Matteo"};

        //dichiaro la variabile per il nome dell'utente
        String nameOfUser;

        //dichiaro lo scanner
        Scanner scan = new Scanner(System.in);

        //faccio scrivere all'utente il proprio nome
        System.out.println("come ti chiami?");
        nameOfUser = scan.nextLine();

        //imposto una variabile booleana come flag
        boolean trovato = false;

        /*soluzione con ciclo for
        //verifico con un un if se il nome corrisponde ad uno dell'array, unendolo con un ciclo for per fare il contorllo con ogni nome della lista
        for (int i = 0; i < arrayInvitati.length; i++) {
            if (nameOfUser.equals(arrayInvitati[i])){
                trovato = true;//il nome viene trovato nell'array durante il ciclo for
                break;
            }
        }

        if (trovato){
            System.out.println("benvenuto, puoi entrare");
        } else {
            System.out.println("mi dispiace, non puoi entrare");
        }
        scan.close();
         */

        //soluzione con ciclo while ( personalmente preferisco il ciclo for)
        int i = 0; // inizializziamo l'indice per il ciclo while

        while (i < arrayInvitati.length && !trovato)/*!trovato vuol dire trovato = false*/ {
            if (nameOfUser.equals(arrayInvitati[i])) {
                trovato = true; // il nome è stato trovato nell'array
            }
            i++; // incrementiamo l'indice per passare all'elemento successivo
        }

        if (trovato) {
            System.out.println("Puoi entrare");
        } else {
            System.out.println("Non puoi entrare");
        }

        scan.close();




    }

}
