
//13 8 




import java.util.Scanner;

public class A_Two_Vessels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            int n = 0;
            float x;
            for (int k = 0; k < 1; k++) {
                if (a > b) {
                    for (int i = 0; i < a; i++) {
                        if (a - 2 * c >= b) {
                            a = a - c;
                            b = b + c;

                            n++;

                        }
                         else {
                            if(a==b){
                                break;
                            }
                            x = (a - b) / 2;
                            a = a - x;
                            b = b + x;
                            n++;
                            if(a==b){
                                break;
                            }
                        }
                        if(a==b){
                            break;
                        }
                    }

                    System.out.println(n);
                    break;
                }
                if (b > a) {
                    for (int i = 1; i <= b ; i++) {
//                         
                        if (b - (2 * c) >= a) {
                            b = b - c;
                            a = a + c;
//5 5 
                            n=n+1;

                        } 
                        else {

                            x = (b - a) / 2;
                            b = b - x;
                            a = a + x;
                            n++;
                        }
                        if(a==b){
                            break;
                        } 
                        
                        
                    }
                    System.out.println(n);
                    break;
                }
                if(a==b){
                    System.out.println("0");
                    break;
                }

            }
        }
    }
}
