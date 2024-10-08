import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String [] args){
        Random rand = new Random();
        int oneToTen = rand.nextInt( 10)+1;
        boolean num=false;
        Scanner in = new Scanner(System.in);
        int guess=0;
        int poop=0;
        String trash;

        System.out.println("Guess a number between 1 and 10!");

        do {
            if (in.hasNextInt()){
                guess=in.nextInt();
                if (guess>oneToTen){
                    System.out.println("Too high! The number was "+oneToTen);
                }else if (guess<oneToTen){
                    System.out.println("Too low! The number was "+oneToTen);
                }else{
                    System.out.println("You guessed correctly! The number was "+oneToTen);
                }
                num=true;

            }else{
                trash=in.nextLine();
                System.out.println("Your input was invalid, try again.");
            }

        }while(!num);


    }
}
