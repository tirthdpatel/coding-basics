
import java.util.Scanner;

public class A_Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x[]= new int[4];
            int y[]= new int[4];
            int temp,temp1;
            for (int i = 0; i < 4; i++) {
                x[i]=sc.nextInt();
                y[i]=sc.nextInt();
                
            }
            for (int i = 0; i < x.length; i++) {
                for (int j = i+1; j < x.length; j++) {
                    if (x[i] < x[j]) {
                        temp = x[i];
                        x[i] = x[j];
                        x[j] = temp;
                    }
                }
            } 
            
            System.out.println((x[0]-x[3])*(x[0]-x[3]));



        }
    }
}