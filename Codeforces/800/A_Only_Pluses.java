
import java.util.Scanner;

public class A_Only_Pluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int x[] = new int[3];
            for (int i = 0; i < x.length; i++) {
                x[i] = sc.nextInt();

            }

            int temp;
            
                for (int k = 0; k < x.length; k++) {
                    for (int j = k + 1; j < x.length; j++) {
                        if (x[k] < x[j]) {
                            temp = x[k];
                            x[k] = x[j];
                            x[j] = temp;
                        }
                    }
                }
//433 434 444 445 545 
                x[2] = x[2] + 1;
            
            for (int i = 0; i < 4; i++) {
                for (int k = 0; k < x.length; k++) {
                    for (int j = k + 1; j < x.length; j++) {
                        if (x[k] < x[j]) {
                            temp = x[k];
                            x[k] = x[j];
                            x[j] = temp;
                        }
                    }
                }
               
                x[2]++;
            }
            System.out.println(x[0]*x[1]*x[2]);
        }
    }
}