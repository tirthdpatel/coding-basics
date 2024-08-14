
import java.util.Scanner;

public class A_New_Year_and_Hurry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int z=240-k ;//z=239
       //60*4=240mins
        int x=0 ,a=0;
        for (int i = 1; i < z; i++) {
            if(z>=(x+i*5)){
             x = x+i*5;
             
             a++;
             if (a==n){
                System.out.println(a);
                break;
            }
            }
        }
        if(a<n)
        System.out.println(a);
        sc.close();
    }
}
