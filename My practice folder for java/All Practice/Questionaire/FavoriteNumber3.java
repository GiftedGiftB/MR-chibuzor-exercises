import java.util.Scanner;
public class FavoriteNumber3{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int myNumber = 7;

	System.out.print("Guess a number from 1 - 10: ");
	int userGuess = input.nextInt();

	if(userGuess == myNumber){
	System.out.print("That's my favorite number!");
	} else{
	System.out.print("Nice try, guess again!");
	}

}
}