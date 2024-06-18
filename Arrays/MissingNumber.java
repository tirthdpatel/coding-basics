
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int x;
        int y=0;
        x = sc.nextInt();
        int a[] = new int[x];
        for (int i = 0; i < a.length-1; i++) {
           //System.out.println("Enter Element " + (i+1)+ " : ");
            a[i]=sc.nextInt();
             y= y+a[i];
        }
        
        int z = x*(x+1)/2;
        System.out.println(z-y);
        
        
        
        
        
        
        sc.close();
    }
}
