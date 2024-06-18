public class VarArgs {
   static  int fo(int ...arr){
 int result =0;
       for (int a: arr) result += a;
       return result;
    }

    public static void main(String[] args) {
        System.out.println(fo(4,5,7));
    }
}
