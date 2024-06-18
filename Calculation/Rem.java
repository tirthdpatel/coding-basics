class Rem {
    public int Rem (int num1 , int num2){
      return num1 % num2;  
    }
    public static void main(String[] args) {
       int num1 = 11;
       int num2 = 6 ;
       Rem obj = new Rem ();
       int answer = obj.Rem(num1, num2) ;
       System.out.println(answer);
    }
}