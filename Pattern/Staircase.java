
public class Staircase {

    public static void main(String args[]) {
        for (int j = 1; j < 6; j++) {
            for (int i = 1; i + j <= 5; i++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
