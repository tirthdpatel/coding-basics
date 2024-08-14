import java.util.Scanner;

public class A_Polycarp_and_Coins{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a,b;
            a=n/3;
            b=n/3;
            if(n%3==0){
                System.out.println(a +" "+b );
            }
            if(n%3==1){
                System.out.println((a+1) +" "+b );
            } 
               if(n%3==2){
                System.out.println(a +" "+ (b+1 ));
            }
        
        

        }
    }
}