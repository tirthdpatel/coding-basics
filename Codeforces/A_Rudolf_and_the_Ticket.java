
import java.util.Scanner;

public class A_Rudolf_and_the_Ticket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            int z=0;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < m ; i++) {
                b[i]=sc.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if((b[i]+a[j])<=k){

                    z++;
                   }
                }
            }
            System.out.println(z);
        }
    }
}
