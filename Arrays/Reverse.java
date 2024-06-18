
import java.util.Scanner;

//java.util.Scanner
public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int x;
        x = sc.nextInt();
        int a[] = new int[x];

        for (int i = 0; i <= x-1; i++) {
            System.out.println("Enter the Element" + (i + 1));
            a[i]=sc.nextInt();
        }
        int b[]=new int[x];
        for(int z=0;z<=x-1;z++){
        b[z]= a[x-1-z];

        }
        for (int i = 0; i < b.length; i++) {
            
            System.out.print( a[i]+"  ");
        }
        System.out.println(" ");
        for (int i = 0; i < b.length; i++) {
            
            System.out.print(b[i]+ "  ");
        }sc.close(); 
        }
}