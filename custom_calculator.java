
import java.util.Scanner;


class myException extends Exception{
  public String toString(){
      return "cannot divide by zero (enter the value of b above 0)";
  } }

  class calculator{
    static int a,b;
   double add(double a , double b){
    System.out.print("the addition is : ");
    double aa = a+b;
        System.out.println(aa);
    return a+b;  
    }
    double sub(double a , double b){
      System.out.print("the subtruction is : ");
      double ss = a-b;
        System.out.println(ss);
      return a-b;  
      }
     double mul(double a , double b){
        System.out.print("the multiplication is : ");
        double m = a*b;
        System.out.println(m);
        return m= a*b;  
      
        }
       double div(double a , double b) throws  myException{
       if(b==0){
          throw new myException();
      }
      double c = a/b;
      System.out.print("the divition is :");
      System.out.println(c);
      return  c = a/b;
     
       }
            
    
          
}
public class custom_calculator{
    public static void main(String[] args) throws myException{
        calculator c = new calculator();
        System.out.println("1. addition");
        System.out.println("2. subtruction");
        System.out.println("3. multiplication");
        System.out.println("4. divition");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int i = sc.nextInt();
        System.out.print("enter value of a: ");
        int a = sc.nextInt();
        System.out.print("enter value of b : ");
        int b = sc.nextInt();
        switch (i) {
            case 1:
                c.add(a,b);
                break;
                case 2:
                c.sub(a,b);
                break;
                case 3:
                c.mul(a,b);
                break;
                case 4:
                c.div(a,b);
                break;
        }
    }
}
