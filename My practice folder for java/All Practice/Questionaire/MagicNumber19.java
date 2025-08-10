import java.util.Scanner;
public class MagicNumber19{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int magicNumber = 42;

	System.out.print("Guess a number: ");
	int userGuess = input.nextInt();

	if(userGuess == magicNumber){
	System.out.print("You found the magic number!");
	} else {
	System.out.print("Keep looking!");
	}
	
}

}