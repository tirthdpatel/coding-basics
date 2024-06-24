
import java.util.Scanner;

public class A_Calculating_Function{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Double n= sc.nextDouble();
        if(n%2==0){
            System.out.println((int)(n/2));
        }
        if(n%2!=0){
System.out.println(-((int)((n+1)/2)));
        }
        sc.close();
    }
}