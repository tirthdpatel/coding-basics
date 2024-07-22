import java.util.Scanner;

public class A_X_Axis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();
            int a=0;
            int b[]= new int[3];
b[0]=x1;
b[1]=x2;
b[2]=x3;
int temp;
for (int i = 0; i < b.length; i++) {
    for (int j = i+1; j < b.length; j++) {
        if (b[i] < b[j]) {
            temp = b[i];
            b[i] = b[j];
            b[j] = temp;
        }
    }
} 
a=b[1];

            int z = Math.abs(x1-a) +  Math.abs(x2-a)  + Math.abs(x3-a);
            System.out.println(z);
        }
    }
}