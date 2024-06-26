
import java.util.Scanner;

public class A_The_New_Year_Meeting_Friends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max = 0;
        // if (x>=y && x>=z){
        //    if(y>z){
        //     max=y;
        //    }
        //    else{
        //     max=z;
        // }
        // }
        // if(y>=x&&y>=z){
        //     if(x>z){
        //         max=x;
        //     }
        //     else{
        //         max=z;
        //     }
        // }
        // if (z>=x&&z>=y){
        //     if(x>y){
        //         max=x;
        //     }
        //     else{
        //         max=y;
        //     }
        // }
        if (x > y && y > z) {
            max = y;
            System.out.println(((x-max) + (max - y) + (max - z)));
        }
        if (z > y && y > x) {
            max = y;
            System.out.println(((max - x) + (max - y) + ( z-max)));
        }
        if (x > z && z > y) {
            max = z;
            System.out.println(((x-max) + (max - y) + (max - z)));
        }
        if (y > z && z > x) {
            max = z;
            System.out.println(((max - x) - (max - y) + (max - z)));
        }
        if (y > x && x > z) {
            max = x;
            System.out.println(((max - x) - (max - y) + (max - z)));
        }
        if (z > x && x > y) {
            max = x;
            System.out.println(((max - x) + (max - y) - (max - z)));
        }

        
sc.close();
    }
}
