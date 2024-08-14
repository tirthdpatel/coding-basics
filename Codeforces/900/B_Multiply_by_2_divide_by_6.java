
import java.util.Scanner;

public class B_Multiply_by_2_divide_by_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = 0, y = 0;
            while (n % 2 == 0) {
                n /= 2;
                x++;
            }
            while (n % 3 == 0) {
                n /= 3;
                y++;
                //y=1
            }
            if (n == 1) {
                if (x > y) {
                    System.out.println("-1");
                }
                if (y >= x) {
                    System.out.println(y * 2 - x);
                }
                // if (x > y) {
                //     System.out.println("-1");
                    
                // }
            }
            else{
                System.out.println("-1");
            }
          }
        }
}
