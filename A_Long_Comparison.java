import java.util.Scanner;

public class A_Long_Comparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            for (int j = 0; j < 1; j++) {

                int a = sc.nextInt();
                int p1 = sc.nextInt();
                int b = sc.nextInt();
                int p2 = sc.nextInt();
                if (p1 > p2) {
                    p1 =p1- p2;
                } else {
                    p2 =p2- p1;
                }
                while (p1 > 0) {
                    a = a*10;
                    p1--;
                }
                while(p2>0){
                    b=b*10;
                    p2--;
                }

                if (a==b ) {
                    System.out.println("=");
                } else {
                    if (a  > b ) {
                        System.out.println(">");
                    } else {
                        System.out.println("<");
                    }
                }

            }
       
        }
        sc.close();
    }
}