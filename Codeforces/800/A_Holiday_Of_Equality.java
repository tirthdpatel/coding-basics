
import java.util.Scanner;

public class A_Holiday_Of_Equality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max;
        int z = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    max = a[i];
                    a[i] = a[j];
                    a[j] = max;
                }
            }
        }
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] +" ");
        // } 
        for (int j = n-1; j > 0; j--) {
            z = z + a[0] - a[j];
        }
        System.out.println(z);
    }
}
