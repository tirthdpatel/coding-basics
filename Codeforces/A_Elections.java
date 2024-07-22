import java.util.Scanner;

public class A_Elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int i = 0; i < 1; i++) {

                if (b >= c) {
                    if (a > b) {
                        System.out.print("0");
                        break;
                    }
                    if (a == b) {
                        System.out.print("1");
                        break;
                    } else {
                        System.out.print(b - a + 1);
                        break;
                    }

                }
                if (c >= b) {
                    if (a > c) {
                        System.out.print("0");
                        break;
                    }
                    if (a == c) {
                        System.out.print("1");
                        break;
                    } else {
                        System.out.print(c - a + 1);
                        break;

                    }

                }

            }
            System.out.print(" ");
            for (int i = 0; i < 1; i++) {

                if (a >= c) {
                    if (b > a) {
                        System.out.print("0");
                        break;
                    }
                    if (a == b) {
                        System.out.print("1");
                        break;
                    } else {
                        System.out.print(a - b + 1);
                        break;
                    }

                }
                if (c >= a) {
                    if (b > c) {
                        System.out.print("0");
                        break;
                    }
                    if (b == c) {
                        System.out.print("1");
                        break;
                    } else {
                        System.out.print(c - b + 1);
                        break;

                    }

                }

            }

            System.out.print(" ");
            for (int i = 0; i < 1; i++) {
    
                if(a>=b){
                    if(c>a){
                        System.out.print("0");
                        break;
                    } 
                     if(a==c){
                        System.out.print("1");
                        break;
                    }
                     else {
                     System.out.print(a-c+1);
                        break;
                    }
                    
                }
                if(b>=a){
                    if(c>b){
                        System.out.print("0");
                        break;
                    } 
                     if(b==c){
                        System.out.print("1");
                        break;
                    }
                     else {
                     System.out.print(b-c+1);
                     break;
                        
                    }
                    
                }
                
                }
                System.out.println(" ");

        }
    }
}