import java.util.Scanner;
public class NumberGuessingGame21{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String secret = "8";
	String userGuess = "";

	while(userGuess != secret){
		System.out.println("Guess the number: ");
		userGuess = input.nextLine().toLowerCase();

		if(userGuess.equals(secret)){
			System.out.println("correct!");
			break;
		}
		else {
			System.out.println("Try again!");
		}
		}
}
}