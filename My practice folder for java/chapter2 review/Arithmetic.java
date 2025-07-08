import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter an first integer: ");
	int userInput1 = input.nextInt();

	System.out.print("Enter an secound integer: ");
	int userInput2 = input.nextInt();

	int squareOfUserInput1 = userInput1 * userInput1;
	
	int squareOfUserInput2 = userInput2 * userInput2;

	int sumOfBothSquare = squareOfUserInput1 + squareOfUserInput2;

	int differenceOfBothSquare = squareOfUserInput1 - squareOfUserInput2;


	
	System.out.println("The first integer square output is: " + squareOfUserInput1);

	System.out.println("The secound integer square output is: " + squareOfUserInput2);

	System.out.println("The sum of both square is: " + sumOfBothSquare);

	System.out.println("The difference of both square is: " + differenceOfBothSquare);
}
}