public class method_overloading {
   static void fo(){
       System.out.println("hello ");
   }
  static void fo(int a){
      System.out.println("value of A: " + a);
  }
  static void  fo(int a,int b){
      System.out.println("value of A : "+ a+ " and the value of B : " +b);
  }
    public static void main(String[] args) {
        fo();
        fo(4);
        fo(4,7);
    }
}
