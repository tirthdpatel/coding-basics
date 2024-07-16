
import java.util.Scanner;

public class B_Good_Kid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int temp;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            a[n - 1] = a[n - 1] + 1;
            int x = 1;
            for (int i = 0; i < a.length; i++) {
                x = x * a[i];
            }
            System.out.println(x);
        }
    }
}
