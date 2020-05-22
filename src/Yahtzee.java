import java.util.Random;
import java.util.Scanner;
public class Yahtzee {
    Scanner sc = new Scanner(System.in);

    //Worp1: 5 dobbelstenen
    public static void main(String[] args) {
        System.out.println("Welkom bij Yahtzee");
        new Yahtzee().spelen();
        System.out.println("Bedankt voor het spelen");

        //1. bepaal je funcionele doelstelling
        //loop maken
        //invoer hebben, beoordeling gelijk aan q, loop
        //invoer gelijk aan 1 => einde
        //invoer niet gelijk aan q => nog een rondje, daarna einde

        //2 technische strategie
        //if else statement (if invoer gelijk is aan q)

        //1 functionele doelstelling
        //Zolang je geen q doet krijg je steeds opnieuw de vraag geef invoer

        //2 technische strategie
        //do while
        //for
        //if ----
    }
    public void spelen() {
        for (; true; ) {
            System.out.println("Wat is uw invoer?");
            String invoer = sc.nextLine();
            if (invoer.equals("q")) {
                System.out.println("jammer");
                break;
            } else {
                System.out.println("nog een rondje");
                Random r = new Random();
                int cijfer = r.nextInt(6) +1;
                System.out.println(cijfer);
            }
        }
    }
}


