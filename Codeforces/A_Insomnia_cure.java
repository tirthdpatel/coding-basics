
import java.util.Scanner;

public class A_Insomnia_cure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int w=0;
        
        for (int i = 1; i <=d; i++) {
            if(k>d||l>d||m>d||n>d){
                System.out.println("0");
                break;
            }
            if(i%k==0||i%l==0||i%m==0||i%n==0){
                w++;
            }
        }
       if(w>0){
        System.out.println(w);
       }
sc.close();
    }}