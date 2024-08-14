
import java.util.Scanner;

public class A_Yogurt_Sale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a*2 >= b) {
                if (n % 2 == 0) {
                    System.out.println(b * n / 2);
                }
                if (n % 2 != 0) {
                    System.out.println(b * (n - 1) / 2 + a);
                }
            }
            if (b > a*2) {
                System.out.println(a*n);
            }
        
        }
 
   }
}