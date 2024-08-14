
import java.util.Scanner;

public class A_Vasya_and_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = 0; i <1; i++) {

                if (a == 0) {
                    System.out.println("1");
                }
                else{
                    System.out.println(a+b*2+1);
                }
            }
        }
    }
}