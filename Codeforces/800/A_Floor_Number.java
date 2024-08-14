
import java.util.Scanner;

public class A_Floor_Number{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if(n<=(i*x+2)){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
//2  7 12 17 22