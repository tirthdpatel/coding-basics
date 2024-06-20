
import java.util.Scanner;

public class KthSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        System.out.println("enter size of array");
        int x = sc.nextInt();
        System.out.println("Enter k");
        int k = sc.nextInt();
        int a[] = new int[x];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Element");
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;

                }
            
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
        System.out.println(" ");
        System.out.println(a[k-1]);
    }

}
