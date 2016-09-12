import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        int aNumber;
        int lastguess= 0;

        Random r= new Random();
        int aRNumber = r.nextInt(10);
        int numTries = 0;
        boolean win = false;

        while (win == false){


            System.out.print("Guess a number between 1 and 10: ");
            Scanner s= new Scanner(System.in);

            aNumber = s.nextInt();


            if (aNumber != lastguess) {
                numTries++;
                lastguess = aNumber;

                if (aNumber == aRNumber) {

                    win = true
                    System.out.println("Your guess is correct");

                } else if (aNumber > aRNumber) {
                    System.out.println("Your guess is too high");
                } else if (aNumber < aRNumber) {
                    System.out.println("Your number is too low");
                }
            }
            else{
                System.out.println("You guessed the same number");

            }

        }
        System.out.println("The correct number was" + aRNumber + "You attempted" + numTries + "times");
    }

}