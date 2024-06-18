
import java.util.Scanner;

public class Peak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int x;
        x = sc.nextInt();
        int Peak[] = new int[x];
        for (int i = 0; i < Peak.length; i++) {
            System.out.println("Enter Element " + (i + 1));
            Peak[i] = sc.nextInt();

        }
        for (int j = 1; j < Peak.length-1; j++) {
            if ((Peak[j - 1]) < Peak[j] && Peak[j] > (Peak[j + 1])) {
                System.out.println(Peak[j]);
            }
        }

        sc.close();
    }

}
