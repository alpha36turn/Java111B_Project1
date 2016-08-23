
import java.util.*;

public class Raffle
{
    private int min;
    private int max;

    public Raffle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lowest ticket number: ");
        min = -1;
        while(true) {
            min = sc.nextInt();
            if (min <= 0) System.out.println("Lowest ticket number must be positive!");
            else break;
        }

        System.out.println("Highest ticket number: ");
        while(true) {
            max = sc.nextInt();
            if (max-min < 3) System.out.println("Must have at least 3 tickets!");
            else break;
        }
    }
}