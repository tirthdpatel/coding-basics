
import java.util.Scanner;

public class A_Collecting_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int x = 0, y = 0, z = 0;
            while (true) {

                if (a > b && a > c) {
                    x = a;
                    if (b > c) {
                        y = b;
                        z = c;
                    } else {
                        y = c;
                        z = b;
                    }
                }
                if (b > a && b > c) {
                    x = b;
                    if (a > c) {
                        y = a;
                        z = c;
                    } else {
                        y = c;
                        z = a;
                    }
                }
                if (c > b && c > a) {
                    x = c;
                    if (b > a) {
                        y = b;
                        z = a;
                    } else {
                        y = a;
                        z = b;
                    }

                }
                break;
            }
            
            if (2 * x - y - z <= n) {
                
                if ((n-2*x+y+z)%3==0){
                System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            if (2 * x - y - z >= n) {
                System.out.println("NO");
            }
        }
    }
}
