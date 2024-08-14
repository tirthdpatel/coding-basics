
import java.util.Scanner;

public class A_Candies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            double x=0;
            for (int i = 2; i < 30; i++) {
double a = 2;
double k;
                // if (n % 3 == 0) {
                //     System.out.println(n / 3);
                //     break;
                // }
                // if (n % 7 == 0) {
                //     System.out.println(n / 7);
                //     break;
                // }
                // if (n % 31 == 0) {
                //     System.out.println(n / 31);
                //     break;
                // }
                // if (n % 127 == 0) {
                //     System.out.println(n / 127);
                //     break;
                // }
                if(n%(Math.pow(a ,i)-1)==0){
                x =n/( Math.pow(a, i) -1);
                break;
                }
            }
            System.out.println((int)x);
        }
    }
}
