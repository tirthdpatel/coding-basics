
import java.util.Scanner;

public class B_DIV_MOD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int a = sc.nextInt();
            int x = r;
            if (x / a + x % a < (x / a - 1 + a - 1)) {
                //1+3

                if (l != r) {
                    if (a - 1 >= l || x / a > 1) {
           
                    System.out.println(x / a - 1 + a - 1);
                }
                else {

                System.out.println(x / a + x % a);
            }
            }
             else {

                System.out.println(x / a + x % a);
            }
        }
        else{
            System.out.println(x/a+x%a);
            }
    }
}
}
