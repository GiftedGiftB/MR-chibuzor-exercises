import java.util.Random;
import java.util.Scanner;
public class MysteryGame3{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);
	Random inputRandom = new Random();

	int randomChoice = inputRandom.nextInt(10) + 1;
	System.out.println("The randomGuess is: "+ randomChoice);

	int tryCount = 0;
	while(tryCount != 3) {
	System.out.println("Choose a number between 1 - 10: ");
	
	int userGuess = inputScanner.nextInt();
	tryCount++;

	if(randomChoice == userGuess) {
	System.out.print("Congratulation, ");
	System.out.println ("it took you "+ tryCount + " tries");
	break;
	}
	if(userGuess != randomChoice){
	System.out.println("wrong. Try again");
	}
	else {
	System.out.print("Better luck next time");
	
	}
  }
 }
}
