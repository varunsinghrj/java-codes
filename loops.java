public class loops {
    public static void main(String[] args) {
        //while loop
        int i=1;
        System.out.print("while loop result : ");
        while (i<=5){
            System.out.print(i +" ");
            i++;
        }
        // do while loop
        System.out.println("\n");
        int j=0;
        System.out.print("do while result : ");
        do{
            j++;
            System.out.print(j +" ");

        }while(j<5);

        //for loops
        System.out.println("\n");
        System.out.print("for loops result : ");
        for (int k =1;k<=5;k++){
            System.out.print(k + " ");
        }
        System.out.println("\n");
        System.out.print("Star pattern ");
        // print pattern using for loop
        for (int l=5;l>0;l--){
            for (int g=0;g<l;g++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.println("Multiplication Table ");
        //Multiplication table using for loop
        for (int f =1 ; f<=10;f++){
            int a= 2 ;
            int d = f*2;
            System.out.println(d);
        }

    }
}

