
import java.util.Scanner;

public class A_Turtle_Puzzle_Rearrange_and_Negate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();

            }
            int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        } 
int b=-1;
// for (int i = 0; i < a.length; i++) {
//     System.out.print(a[i] +" ");
// }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0){
                b=i;
            }
        }
        for (int i = b+1; i < a.length; i++) {
            a[i]=-a[i];
        }
        int z =0;
        for (int i = 0; i < a.length; i++) {
            z= z+a[i];
        }
System.out.println(z);
        }
    }
}