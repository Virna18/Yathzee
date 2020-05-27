import java.util.ArrayList;
import java.util.Scanner;

public class YahtzeeSpel {
    static ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<>();

        public YahtzeeSpel(){
            for (int i = 0; i < 5; i++) {
                Dobbelsteen dobbelsteen = new Dobbelsteen();
                dobbelstenen.add(dobbelsteen);
            }
    }

    Scanner sc = new Scanner(System.in);

    public void spelen() {
        for (; true; ) {
            System.out.println("Wat is uw invoer?");
            String invoer = sc.next();
            if (invoer.equals("q")) {
                System.out.println("jammer");
                break;
            } else {
                for (Dobbelsteen dbs : dobbelstenen){
                    dbs.waarde = dbs.werpen();
                    System.out.println(dbs.waarde);

                }
            }
        }
    }
    public void vasthouden(){
        System.out.println("Welke dobbelstenen wil je vasthouden?");
        String invoer = sc.next();
    }


}
