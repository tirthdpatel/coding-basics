
import java.util.Scanner;

public class A_2_3_Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
          
           for (int i = 0; i < 1; i++) {
            
           

                if (n == 4) {
                    System.out.println("2");
                    break;
                }
                if (n == 1) {
                    System.out.println("2");
                    break;
                } 
                if (n == 5) {
                    System.out.println("2");
                    break;
                } 
                if (n == 3) {
                    System.out.println("1");
                    break;
                } 
                if (n == 2) {
                    System.out.println("1");
                    break;
                } 
                else {
                    System.out.println(n/3);
                    break;
                }
            }
        }
    }
}