
import java.util.Scanner;

public class A_Soldier_and_Bananas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int x=0;
        for (int i = 1; w>=0; i++) {
            if(w!=0){
            x=x+i*k;
           ;
        }
            if(w==0 && n>=x){
                System.out.println("0");
                break;
            }
            if(w==0 && n<x){
                System.out.println(x-n);
                break;
            }  
        w--;
        
        }
        
    }
}
//3+6+9+12=30