class Mul {
    public int Mul (int num1 , int num2){
      return num1 * num2;  
    }
    public static void main(String[] args) {
       int num1 = 5;
       int num2 = 4 ;
       Mul obj = new Mul ();
       int answer = obj.Mul(num1, num2) ;
       System.out.println(answer);
    }
}
