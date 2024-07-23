import java.util.Scanner;

public class A_Replacing_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int temp;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {

               

                    if ((a[n - 2] + a[n - 1]) <= d||d>=a[0]) {
                        System.out.println("YES");
                        break;
                    }

                    else {
                        System.out.println("NO");
                        break;
                    }
                
            }
        }
    }
}