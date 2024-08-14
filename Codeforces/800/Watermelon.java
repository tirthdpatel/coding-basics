
import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int x = w%2;
        if (w==2){
            System.out.println("NO");

        }
        if (x==1){
            System.out.println("NO");
        }
        if(x==0 &&  w!=2){
            System.out.println("Yes");
        }
    sc.close();
    }
}

