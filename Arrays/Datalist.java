import java.util.Scanner;

public class Datalist {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of student");
            
            int num;
            num = sc.nextInt();
            int Student[] = new int[num];

            for(int i = 0 ;i < Student.length;i++ ){
            System.out.println("Enter Student Number " + (i+1)+" : ");
            Student[i] = sc.nextInt();
            }
            int Maa[] = new int[Student.length];
           for (int j =0 ; j< Student.length;j++){
            System.out.println("Enter Marks of Student " +(j+1) + " : ");
            Maa[j] = sc.nextInt();
           }
           System.out.println( "NAME  :  MARKS" );
           for(int k = 0 ; k < Student.length;k++){
            System.out.print(Student[k] + "   ");

            System.out.println( Maa[k] );
           }
        
        sc.close();
}
}

