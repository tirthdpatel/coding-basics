
import java.util.Scanner;

public class MaximumAndMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int z[] = new int[n];
        int y = 0, k = 0, max = z[0];
        while (t > 0) {

            for (int x = 2; x <= n; x++) {
                for (int i = 0; i <= n; i++) {
                    if (i * x <= n) {
                        k = k + x + i * x;
                        y++;
                    } else {
                    }

                }
                z[x - 2] = y;
                y = 0;

            }

            for (int i = 0; i < z.length; i++) {
                if (z[i] < max) {
                    z[i] = max;

                } else {
                    max = z[i];
                }

            }

            System.out.println(max);
            t--;
        }
        sc.close();
    }
}
