import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int number1 = giftScanner.nextInt();
	int square1 = number1 * number1;
	System.out.printf("the square is %d%n", square1);

	System.out.print("Enter second number : ");
	int number2 = giftScanner.nextInt();
	int square2 = number2 * number2;
	System.out.printf("the square is %d%n ", square2);

	int SumOfSquares = square1 + square2;
	System.out.printf("sum of their square is %d%n", SumOfSquares);

	int differenceOfSquare = square1 - square2;
	System.out.printf("difference of their square is %d%n", differenceOfSquare);	
  }

}