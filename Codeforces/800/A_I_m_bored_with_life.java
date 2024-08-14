
import java.util.Scanner;

public class A_I_m_bored_with_life{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x= 1,y=1;
        for (int i = 1; i <= a; i++) {
            x=x*i;
        }
        
        for (int i = 1; i <= b; i++) {
            y=y*i;
        }
        

        
        int gcd = x;
        while (gcd % y != 0) {
            gcd += x;
        }

       
        int lcm = (x * y) / gcd;



       System.out.println(lcm);
    }
}