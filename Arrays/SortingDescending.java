
import java.util.Scanner;

public class SortingDescending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int x, temp = 0;
        x = sc.nextInt();
        int a[] = new int[x];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Element " + (i + 1) + " : ");
            a[i] = sc.nextInt();

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
        for (int i = 0; i < a.length; i++) {
            
            System.out.print(a[i]+ "     ");
        }
        sc.close();
    }
}
