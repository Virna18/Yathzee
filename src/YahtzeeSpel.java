import java.util.Random;
import java.util.Scanner;

public class YahtzeeSpel {
    Scanner sc = new Scanner(System.in);

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
                int cijfer = r.nextInt(6) + 1;
                System.out.println(cijfer);
            }
        }
    }
}
