import java.util.Scanner;

class myException extends Exception{
    public String getMessage(){
        return "Make sure your entered age is currect (age cannot  above 100)";
    }
}
public class ownexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("enter your age :");
        age = sc.nextInt();

        if (age>100){
            try{
                throw new myException();
            }
            catch(Exception e){
            
                System.out.println(e.getMessage());
            
            }
        }
        else if(age>=18){
            System.out.println("you are adult you can drive ");
        }
        else{
            System.out.println("you are below 18 you can't drive ");
        }
        
    }
    
}
