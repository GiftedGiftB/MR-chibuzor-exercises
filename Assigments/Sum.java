import java.util.Scanner;
public class Sum{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer");
	int number1 = input.nextInt();

	System.out.print("Enter second integer");
	int number2 = input.nextInt();

	int Sum = number1 + number2;
	System.out.printf("Sum is %d%n", Sum);

   }

}