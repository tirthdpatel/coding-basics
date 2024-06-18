
import java.util.Scanner;

public class Aaray {
   

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The size Of The Aaray");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int A = 0; A < size ; A++ ) {

            System.out.println("Element" + (A + 1) + ": ");
           array[A] = scanner.nextInt(); 
            System.out.println(array[A]);
        }
        System.out.println(array);
        scanner.close();
    }

}

