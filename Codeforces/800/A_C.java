
import java.util.Scanner;

public class A_C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
      int x=1,z;
            if(a>=b){
                z=a+b;
                // x++;
              while(a<=n){
                a=a+z;
            x++;
              }  
              System.out.println(x);
            }
            if(b>a){
                z=a+b;
               // x++;

                while(b<=n){
                  b=b+z;
              x++;
                }  
                System.out.println(x);
              }
        }
    }
}