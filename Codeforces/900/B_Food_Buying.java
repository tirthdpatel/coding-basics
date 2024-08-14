import java.util.Scanner;

public class B_Food_Buying{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while (t-->0) {
        double a = sc.nextDouble();
     int x=0;
     int y=0;
     x=x+ (int)a;
     while((int)a>0){
      
      y=(int)a;
        a=a-(int)y + a/10;
        y=(int)a;
        x=x+y;
     }
     System.out.println(x);
       }
    }
}