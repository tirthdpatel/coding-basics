
// import java.util.Scanner;

import java.util.Scanner;

public class Reverseexchange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size ");
        int x;
        x = sc.nextInt();
        int a[] = new int[x];

        for (int i = 0; i <= x-1; i++) {
            System.out.println("Enter the Element" + (i + 1));
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < a.length/2; i++) {
            int z = a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=z;
        }
for (int i = 0; i < a.length; i++) {
    System.out.print(a[i]+"  ");
    
}
    }
}
