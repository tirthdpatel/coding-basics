
import java.util.Scanner;

public class A_Odd_Divisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextDouble();
            while (n % 2 == 0) {
                n /= 2;
            }
            if (n == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
