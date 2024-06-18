public class recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("factorial : ");
        System.out.print(factorial(5));
    }
}
