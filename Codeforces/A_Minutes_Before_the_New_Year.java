import java.util.Scanner;

public class A_Minutes_Before_the_New_Year{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-->0){
            int h = sc.nextInt();
            int m = sc.nextInt();
            int a ,b;
            a= 60*(23-h);
            b=60-m;
            System.out.println(a+b);
        }
    }
}