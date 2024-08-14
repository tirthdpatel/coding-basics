
import java.util.Scanner;

public class C_Vasilije_in_Cacak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextDouble();
            double k = sc.nextDouble();
            double x = sc.nextDouble();
            double z = 0, y = 0;

            if ((n*(n+1)/2)-((n-k)*(n-k+1)/2)>=x){
                if(x>=k*(k+1)/2){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
