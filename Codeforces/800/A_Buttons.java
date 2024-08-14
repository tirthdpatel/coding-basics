
import java.util.Scanner;

public class A_Buttons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == b) {
                if (c % 2 == 0) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }

            }
            if (a > b) {
                int x = a - b;
                if (x > c) {
                    System.out.println("First");
                } else {
                    int y = c - x;
                    if (y % 2 == 0) {
                        System.out.println("Second");
                    } else {
                        System.out.println("First");
                    }
                }
            }
            if (b > a) {
                int x = b - a;
                if (x > c) {
                    System.out.println("First");
                } else {
                    int y = c - x;
                    if (y % 2 == 0) {
                        System.out.println("Second");
                    } else {
                        System.out.println("First");
                    }
                }
            }
            t--;
        }
    }
}
