import java.util.Scanner;


public class A_Vasya_and_Socks{

    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = n;
        for (int i = 1; i <= x ; i++) {
            if(i%m==0){
                x=x+1;
            }

        }
        System.out.println(x);
    }
}