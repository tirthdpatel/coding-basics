
import java.util.Scanner;

public class A_Wallet_Exchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String ans = (a + b) % 2 == 0 ? "Bob" : "Alice";
            System.out.println(ans);
            t--;
        }
sc.close();
    }

}
