package game;
import java.util.*;

public class Main {

    public static void main(String[] args) {
                   
                   // Random package for generating a random number from 1 to 100
    	Random random = new Random();
    	int randomNumber = random.nextInt(100) + 1;  

    	// Scanner package for user input
    	Scanner scanner = new Scanner(System.in);
    	int attempts = 5;
    	boolean guessed = false;

    	System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");

    	// for loop for count the attempts
    	for (int i = 1; i <= attempts; i++) {
    		System.out.print("Attempt number " + i + ": Insert number: ");
    		int userNumber = scanner.nextInt();
 
    		// Compare the entered number with the random number, to see if it guessed or is less than or greater than the random number
    		if (userNumber == randomNumber) {
    			System.out.println("¡YAY! You guessed the correct number.");
    			guessed = true;
    			break;
    		} else if (userNumber > randomNumber) {
    			System.out.println("The number is smaller");
    		} else {
    			System.out.println("The number is greater.");
    		}
 
    		// show difference using Math.abs()
    		int difference = Math.abs(userNumber - randomNumber);
    		System.out.println("You are  " + difference +" units away.");
    	}

    	// if the user don't guess the number
    	if (!guessed) {
    		System.out.println("You did not make it. The correct number was: " + randomNumber);
    	}
                                 
                   
    }

}
