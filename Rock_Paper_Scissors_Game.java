import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors_Game {
    public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                while(true) {
                    String [] availableMoves = {"Rock", "Paper", "Scissors"};
                    String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
                    System.out.println("it's your turn to choose. Good Luck!");
                    String userMove;
                    while(true) {
                        System.out.println("Please choose your move from these available moves : 'Rock' 'Paper' 'Scissors' ");
                        System.out.print("Enter the move you chose : ");
                        userMove = scn.nextLine();

                        if(userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")){
                            break;
                        }
                        System.out.println("Invalid Move!!");
                        System.out.println("Please enter the move from the available moves only!");
                    }

                    System.out.println("Computer chose : " + computerMove);

                    if(userMove.equals(computerMove)) {
                        System.out.println("Its a tie!");
                    }

                    else if(userMove.equals("Rock")) {

                        if(computerMove.equals("Paper")) {
                            System.out.println("Computer won!");
                            System.out.println("Better luck next time!");
                        }
                        else if(computerMove.equals("Scissors")) {
                            System.out.println("You won!");
                            System.out.println("Congratulations!");
                        }
                    }

                    else if(userMove.equals("Paper")) {

                        if(computerMove.equals("Rock")) {
                            System.out.println("You won!");
                            System.out.println("Congratulations!");
                        }
                        else if(computerMove.equals("Scissors")) {
                            System.out.println("Computer won!");
                            System.out.println("Better luck next time!");
                        }
                    }

                    else if(userMove.equals("Scissors")) {

                        if(computerMove.equals("Paper")) {
                            System.out.println("You won!");
                            System.out.println("Congratulations!");
                        }
                        else if(computerMove.equals("Rock")) {
                            System.out.println("Computer won!");
                            System.out.println("Better luck next time!");
                        }
                    }
                    String playAgain;
                    System.out.println("Do you want to play again? ");
                    while(true) {
                        System.out.println("Type 'yes' or 'no' ");
                        playAgain = scn.nextLine();

                        if(playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("no") || playAgain.equals("No")) {
                            System.out.println();
                            System.out.println("*****************************************************************************");
                            System.out.println();
                            break;
                        }
                        System.out.println();
                        System.out.println("Invalid Input");
                        System.out.println();
                    }

                    if(playAgain.equals("no") || playAgain.equals("No")) {
                        break;
                    }
                }
            }
        }