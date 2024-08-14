
import java.util.Scanner;

public class B_New_Year_s_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = 0, y = 0;
            y = n % 2020;
            x = (n - y) / 2020 - y;
            if (x * 2020 + y * 2021 == n && x >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
