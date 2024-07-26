
import java.util.Scanner;

public class nested {
    public static void main (String[] args){
        int[] arr = {1,2,3 };
        
    Scanner sc = new Scanner(System.in);
    boolean k = true;
    while (k) {
        System.out.print("enter the value of index : ");
        int index = sc.nextInt();
        try{
            try{
                System.out.print("the value of this index is : ");
                System.out.println(arr[index]);
                k = false;
            }
            catch (Exception e) {
                
                System.out.println("this index not exist the error is : ");
                System.out.println(e);
                }
    
        }
        catch(Exception c){
            System.out.println("can't run !! the error :");
            System.out.println(c);
        }
        
        }
        
    }

    
} 