
import java.util.Scanner;

public class A_Even_Odds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        if (k > n / 2) {
            if (n % 2 == 0) {
                System.out.println((int)(2 * (k - n / 2)));
            } else {
                System.out.println((int)(2*k-n-1));
            }
        } else {
            System.out.println((int)(2 * k - 1));
        }

    }

}
