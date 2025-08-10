import java.util.Scanner;
public class GuessTheAnimal15{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String myAnimal = "dog";
	
	System.out.println("Guessing Game,Let's play.");

	System.out.print("Guess the animal: ");
	String userChoice = input.nextLine().toLowerCase();

	if(userChoice.equals("myAnimal")){
	System.out.print("Correct it's a dog!");
	} else {
	System.out.println("Nope, its a dog!");
	}
}

}