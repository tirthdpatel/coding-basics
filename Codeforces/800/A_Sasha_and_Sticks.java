
import java.util.Scanner;

public class A_Sasha_and_Sticks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = 0;
        while (x >= 0) {
            x = x - y;

            z++;
        }
        if (z % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
