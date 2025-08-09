import java.util.Scanner;
public class AgeRestriction13{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int minimumAge = 10;

	System.out.print("How old are you: ");
	int userInput = input.nextInt();

	if(userInput >= 10){
	System.out.println("Welcome to the show!");
	} else {
	System.out.println("Sorry, you're too young!");
	}

}

}