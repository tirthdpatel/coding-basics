
import java.util.Scanner;

public class A_Minimal_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x, y = 0, z = 0;
            if (2 * b > a) {
                z = 2 * b;
            } else {
                z = a;
            }
            if (z != 0) {
                if (2 * a > b) {
                    y = 2 * a;
                } else {
                    y = b;
                }

            }
            if (z != 0 && y != 0) {
if(z>y){
    System.out.println(y*y);
}
else{
    System.out.println(z*z);
}
            }
        }
    }
}
