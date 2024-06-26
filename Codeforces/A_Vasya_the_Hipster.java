
import java.util.Scanner;

public class A_Vasya_the_Hipster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int h = 0, l = 0;

        if (r > b) {
            h = r;
            l = b;
        } else {
            h = b;
            l = r;
        }
        System.out.print(l + " ");
        if ((h - l) % 2 == 0) {
            System.out.println((h - l) / 2);
        } else {
            System.out.println((h - l - 1) / 2);

        }
        sc.close();
    }
}
