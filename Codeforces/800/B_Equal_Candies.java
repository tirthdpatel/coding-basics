
import java.util.Scanner;

public class B_Equal_Candies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int a[]= new int[n];
            int temp=0;
            for (int i = 0; i < n; i++) {
                 a[i]=sc.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            
            }
            int b = a[0],c=0,d=0;
            for (int i = 0; i < a.length; i++) {
                d=a[i]-a[n-1];
                c=c+d;
            } 
            System.out.println(c);
        }
    }
}