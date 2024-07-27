import java.util.ArrayList;
import java.util.Scanner;
class myexception extends  Exception{
    public String toString(){
        return "Please enter valid input (Enter a postive values";
    }
}
public class array_list{
    static int j;
    public static void main(String[] args) throws myexception  {
       ArrayList<Integer> al = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of Array : ");
       int size = sc.nextInt(); 
       if(size<=0){
        throw new myexception();
       }  
       boolean i = true;
       while(i){
        System.out.print("enter the Element :");
            int k = sc.nextInt();
        al.add(k);
       if(al.size()==size){
        i = false;
       }
    }
    System.out.print("the array list :"); 
    for(int j=0 ;j<al.size();j++){
        System.out.print(al.get(j) + " ");
    }
    boolean t= true;
    while(t){ 
    System.out.println(" ");
    System.out.println("What you want to do ");
    System.out.println("1. Remove element");
    System.out.println("2. Add elements");
    System.out.println("3. Find element with value ");
    System.out.println("4. Find element with index ");
    System.out.println("5. Set the element with index");
    System.out.println("6. Show the Array");
    System.out.println("7. Remove all elements ");
    System.out.println("8. Exit");
    System.out.print("Enter your choice : ");
    int s = sc.nextInt();
    switch (s) {
        case 1:
            System.out.print("Enter the element to remove : ");
            int s1 = sc.nextInt();
            boolean s11 = al.contains(s1);
            int s12 = al.indexOf(s1);
            while(s11){
                al.remove(s12);
                System.out.println("Element removed successfully");
                System.out.print("the array list is :"); 
                for(int j=0 ;j<al.size();j++){
                    System.out.print(al.get(j) + " ");
                     }
                break;
            }
            break;
        case 2 :
                System.out.print("Enter element to add : ");
                int s21 = sc.nextInt();
                al.add(s21);
                System.out.println("Element added successfully"); 
                System.out.print("the array list is :"); 
                for(int j=0 ;j<al.size();j++){
                    System.out.print(al.get(j) + " ");
                     }
                break;
        case 3 :
                System.out.print("Enter the element to find :");
                int s31 = sc.nextInt();
                boolean s32 = al.contains(s31);
                while (s32) {
                    System.out.print("Element finds successfully at the index of : ");
                    int s33 = al.indexOf(s31);
                    System.out.println(s33);
                    break;
                }
                break;
        case 4:
                System.out.print("Enter the index to find element : ");
                int s41 = sc.nextInt();
                int s42 = al.get(s41);
                System.out.println("Element finds successfully");
                System.out.print("The Element is : ");
                System.out.println(s42);
                break;
        case 5:
        try{ 
               System.out.print("Enter the index to replace value : ");
               int s51 = sc.nextInt();
               System.out.print("Enter the Element to insert : ");
               int s52 = sc.nextInt();
               al.set(s51, s52);
               System.out.println("Element replaced successfully");
               System.out.print("the array list is :"); 
               for(int j=0 ;j<al.size();j++){
                   System.out.print(al.get(j) + " ");
                    }
                }
                 catch (Exception e) {
                    System.out.println("please add element beacause its thow exception");
                    System.out.println(e);
                }
               break;

        case 6:
        System.out.print("The Array list is : "); 
        for(int j=0 ;j<al.size();j++){
            System.out.print(al.get(j) + " ");
            
             }
             if(al.isEmpty()){
                System.out.println("Empty");
            }
        break; 
        case 7 :
        System.out.println("Removed all elements successfully ");
        al.removeAll(al);
        break;
        case 8 :
        System.out.println("Exit successfully");
            t = false;
            break;
        default:
        System.out.println("Error (make sure you enter valid input)");

    }
}
} 
}