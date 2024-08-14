
import java.util.Scanner;

public class B_Kana_and_Dragon_Quest_game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int v = sc.nextInt();
            int l = sc.nextInt();
            if (h - l * 10 > 0) {
                for (int i = 0; i < v; i++) {
                    h = h / 2 + 10;
                }
            }
            else{}
            for (int i = 0; i < l; i++) {
                h = h - 10;
            }
            if (h * (-1) >= 0) {
                System.out.println("YES");
            }
            if (h * (-1) < 0) {
                System.out.println("NO");
            }

        }
   sc.close();
    }
}
