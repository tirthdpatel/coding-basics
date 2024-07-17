
import java.util.Scanner;

public class A_Two_Elevators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        while (f-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x=0,y=0;
            if (b>c){
                 x =b;
                 y=c;
            }
            if (c>b){
                 x =c;
                 y=b;
            }
            
            int t = x-y+c-1;
            if((a-1)<t){
                System.out.println("1");
            }
            if(t<(a-1)){
                System.out.println("2");
            }
            if(t==(a-1)){
                System.out.println("3");
            }
        }
    }
}