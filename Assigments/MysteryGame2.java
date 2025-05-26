import java.util.Random;
import java.util.Scanner;
public class MysteryGame2{
	public static void main(String[] args){
	Random random = new Random();
	Scanner inputScanner = new Scanner(System.in);
	
	int randomGuess = random.nextInt(10) + 1;
	System.out.println("randomGuess is: "+ randomGuess);	

	while(attempt < maxAttempts) {
	System.out.print("Guess a number: ");
	int userGuess = inputScanner.nextInt();

	if(randomGuess == userGuess){
	System.out.println("you are correct");
	break;
	}
	else if(userGuess != randomGuess){
	System.out.println("wrong try again");
	}
	else{
	System.out.println("Better luck next time");
	break;
	}
  }
}
}