
import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int x,z=0;
        // int
        x = sc.nextInt();
        int a[] = new int[x];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter Element " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]<max){
                a[i]=max;
                z= i;
            }
            else{
                max=a[i];
            }
        }
        System.out.println("  "+ max +"   "+ z);jijk
        sc.close();
    }
}
