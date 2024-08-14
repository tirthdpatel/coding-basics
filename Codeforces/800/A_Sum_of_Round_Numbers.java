
import java.util.Scanner;

public class A_Sum_of_Round_Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int x = sc.nextInt();
            int a ,b ,c, d ,e ;
            a=x/10000;
            b=(x-a*10000)/1000;
            c=(x-a*10000-b*1000)/100;
            d=(x-a*10000-b*1000-c*100)/10;
            e=(x-a*10000-b*1000-c*100-d*10);
            if (c==0){
                
            }
System.out.println( a*10000 + " "+b*1000+" "+c*100+" "+d*10+" "+e);
            
            t--;
        }
    }
}