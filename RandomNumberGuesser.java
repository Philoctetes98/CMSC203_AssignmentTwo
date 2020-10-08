import java.util.Scanner;


/**
 * This is the main driver class for the Random Number
 * Guesser Program
 * @author binya
 *
 */
public class RandomNumberGuesser {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		//create the guess variable
		int nextGuess;
		//create the choice variable
		int c = 0;
		//Print out a header
		System.out.println("Welcome to the Random Number Guesser Program");
		//Start the prompt for guessing
		do {
			//Start the count at 0
			RNG.resetCount();
			//random number to be generated
			int randNum = RNG.rand();
			//the high guess
			int highGuess = 100;
			//the low guess
			int lowGuess = 1;
			//Tell the user that the random number has been generated
			System.out.println("The Program has generated a random number."
					+ " Now you must try to guess it.");
		do {
            //prompt the user to enter their guess
			System.out.println("Enter your guess: ");
			//input the guess
			nextGuess = keyboard.nextInt();
			//check if the guess matches the number generated
			if (RNG.inputValidation(nextGuess, lowGuess, highGuess)) 
			{
			if (nextGuess <= randNum && (nextGuess-randNum) < (randNum-lowGuess) ){
				lowGuess = nextGuess;
					}
				if (nextGuess >= randNum && (nextGuess-randNum) < (highGuess-randNum)) {
					highGuess = nextGuess;
					}
				}
		}while (nextGuess != randNum);
			//Tell the user that the number has been guessed correctly
			System.out.println("Congratulations, you have guessed correctly.");
			//Ask the user if they would like to try the generator again
			System.out.println("Would you like to try again? (1 for yes or 2 for no)");
			//Input the user's choice
			c = nextGuess = keyboard.nextInt();
			keyboard.nextLine();
		} while (c == 1);
		//if the user chooses no
		if (c == 2)
		{
			System.out.println("Thanks for playing....");
		}
			
	}
}
