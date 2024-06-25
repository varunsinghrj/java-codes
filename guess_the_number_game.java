import java.util.Scanner;
    public class guess_the_number_game {
        static int game() {
           int guess = 1 + (int)(100
                    * Math.random());
           return guess;
        }
          static   Scanner s = new Scanner(System.in);
        static int g =game();
       static int k =6 ;
        static void check() {
            int j;
            for (j=1;j<k;j++) {
                System.out.print("Guess number between 1 to 100  within 5 trials : ");
                int i = s.nextInt();
                if (g == i) {
                    System.out.println("you guessed right number");
                    System.out.println("the number was : "+ game());
                    break;
                } else if (g > i && j != k - 1) {
                    System.out.println("your number is greater than " + i);

                } else if (g < i && j != k - 1){
                    System.out.println("your number is smaller than " + i);
                }

            }
            if (j == k){
                System.out.println("You have exhausted "+ k+" trials");
                System.out.println("the number was : "+ game());
            }
        }
        public static void main(String[] args) {
            check();
        }
    }
