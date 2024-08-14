
import java.util.Scanner;

public class A_Yet_Another_Two_Integers_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int z;

            //
            if (a>b){
                z=a-b;
                System.out.println((z+9)/10);

            }
            
            if (b>a){
                z=b-a;
                System.out.println((z+9)/10);
            }
           if (a==b){
            System.out.println("0");
           }
            
            t--;
        }
    }
}
