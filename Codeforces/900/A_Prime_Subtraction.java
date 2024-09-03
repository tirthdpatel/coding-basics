import java.util.Scanner;

public class A_Prime_Subtraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a-b==1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
