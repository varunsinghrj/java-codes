public class logical_operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b= false;
        // logical AND
        if(a && b){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        //logical OR
        if (a || b) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        //logical NOT
        System.out.print("if a is true : ");
        System.out.println(!a);
        System.out.print("if b is false :");
        System.out.println(!b);
    }
}
