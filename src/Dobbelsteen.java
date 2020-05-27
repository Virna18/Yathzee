import java.util.Random;

public class Dobbelsteen {

int waarde;

    public int werpen() {
        Random r = new Random();
        waarde = r.nextInt(6) + 1;
        System.out.println(waarde);
        return waarde;
    }
}
