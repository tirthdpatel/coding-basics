
import java.util.Scanner;

public class A_Buy_a_Shovel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int z;
        for (int i = 1; i < 10; i++) {
            z = k * i ;
            if (z%10 == r||z%10==0) {
System.out.println(i);
break;

            }
            else {
                z=0;
            }
        }
        sc.close();
    }
}
