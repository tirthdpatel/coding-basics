import java.util.Scanner;

public class A_Orac_and_Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + 2 * k);
            } else {
                for (int i = 2; i < 1000000; i++) {
                    if (n % i == 0) {
                        d = i;
                        break;
                    }

                }
                System.out.println(n + 2 * (k - 1) + d);

            }
        }
        
        sc.close();
    }
}