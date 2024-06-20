import java.util.Scanner;

public  class Lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x ,l ,r;
        System.out.println("Enter  l");
        l= sc.nextInt();

        System.out.println("Enter  r"); 
        r= sc.nextInt();
        if(l>r){
        x=r;}
        else {x=l;}
        while (true) { 
            if(x %l==0 && x % r==0){
            break;}
            x++;
        }    
        System.out.println(x);   
sc.close();
    }
}
