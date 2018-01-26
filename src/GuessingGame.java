import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		char letter = 'y';
		int guess;
		int numberOfTries = 0;
		int success = 0;

		System.out.println("Welcome to the Guess a Number Game!");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.printf("%n");
		System.out.println("I'm thinking of a number between 1 and 100.");
		System.out.println("Try to guess it, n00b.");
		System.out.printf("%n");

		
		int randomNum = (int) (Math.random() * 100) + 1;
		while (success == 0 || letter == 'y') {
			
			numberOfTries++;
			System.out.println("Enter your lousy guess: ");
			guess = scan.nextInt();
			System.out.println("You guessed: " + guess);
		
			if ((guess < 1) || (guess > 100)) {
				System.out.println("Invalid Input");
			} else if (guess == randomNum) {
				System.out.println("You guessed in " + numberOfTries + " tries.");
				success ++;
			} else if (guess - 10 >= randomNum) {
				System.out.println(guess + " Your guess is too High. Try again!");
			} else if (guess + 10 <= randomNum) {
				System.out.println(guess + "Your guess is too low. Try again!");
			} else if (guess > randomNum){
				System.out.println("");
			} else if (guess < randomNum){
				System.out.println("");
			}
			System.out.println("Try Again? (y/n)");
			letter = scan.next().charAt(0);
		
			
		}
		System.out.println("Goodbye!");

	}
}

