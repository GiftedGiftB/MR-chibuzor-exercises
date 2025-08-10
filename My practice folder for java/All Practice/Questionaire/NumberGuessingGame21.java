import java.util.Scanner;
public class NumberGuessingGame21{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String secret = "8";
	String userGuess;
	System.out.print("Guess the number: ");
	userGuess = input.nextLine();
	
	if(userGuess == secret){
	System.out.print("correct!");
	} else {
	System.out.print("Try again!");
	}
}
}