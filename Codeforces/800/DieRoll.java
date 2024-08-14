
import java.util.Scanner;

public class DieRoll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int high;
        if (x > y) {
            high = x;

        } else {
            high = y;

        }

        int ans = 7 - high;
        if (ans == 6) {
            System.out.println("1/1");
        }
        if (ans % 2 == 0 && ans != 6) {
            System.out.println(ans / 2 + "/3");

        }

        if (ans % 3 == 0 && ans != 6) {
            System.out.println(ans / 3 + "/2");

        }

        if (ans % 5 == 0 || ans == 1) {
            if(ans != 6){

                System.out.println(ans + "/6");
            }
        }
        sc.close();
    }
}
