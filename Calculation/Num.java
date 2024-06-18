class Num {
    public int add (int num1 , int num2){
      return num1 + num2;  
    }
    public static void main(String[] args) {
       int num1 = 5;
       int num2 = 4 ;
       Num obj = new Num ();
       int answer = obj.add(num1, num2) ;
       System.out.println(answer);
    }
}
