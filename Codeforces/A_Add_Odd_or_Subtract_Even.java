
import java.util.Scanner;

public class A_Add_Odd_or_Subtract_Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
          for (int i = 0; i <1; i++) {
            
            if(a==b){
                System.out.println("0");
                break;
            }
            if (a > b) {
                if (a % 2 == 0 && b % 2 == 0) {
                    System.out.println("1");
                    break;
                }
                if (a % 2 != 0 && b % 2 != 0) {
                    System.out.println("1");
                    break;
                } 
                else {
                    System.out.println("2");
                    break;
                }
            }
            if (b > a) {
                if (a % 2 == 0 && b % 2 == 0) {
                    System.out.println("2");
                    break;
                }
                if (a % 2 != 0 && b % 2 != 0) {
                    System.out.println("2");
                    break;
                } 
                else {
                    System.out.println("1");
                    break;
                }
            }
            
        }
        }
    }
}
