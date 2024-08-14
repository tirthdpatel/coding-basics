
import java.util.Scanner;

public class TurtleAndPiggy1981A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        // System.out.println(t);

        while (t > 0) {
            int l, r;
            // System.out.println(t);
            l = sc.nextInt();
            r = sc.nextInt();
            int ans = (int) (Math.log(r) / Math.log(2));
            System.out.println(ans);
            t--;
        }
    }
}
