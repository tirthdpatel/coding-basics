
import java.util.Scanner;

public class A_Nastya_and_Rice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int x = (a - b)*n;
            int w = n*(a+b);
            int y = c - d;
            int z = c + d;

            if(x>z||w<y){
                System.out.println("No");
            }
            else{System.out.println("Yes");
        }
       
    }
    
}

}