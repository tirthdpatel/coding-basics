
import java.util.Scanner;

public class A_Plus_One_on_the_Subset{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int x = sc.nextInt();
            int a[]= new int[x];
            for (int i = 0; i < x; i++) {
                a[i]=sc.nextInt();
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
            System.out.println(a[0]-a[x-1]);




            t--;
        }
    }
}