import java.util.Scanner;
public class SimpleCalculator28{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("This is a mini calculator");

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("will you like to '+' or '-' : ");
	char operator = input.next().charAt(0);

	if(operator == '+'){
	int result = firstNumber + secondNumber;

	System.out.print(firstNumber + " + " + secondNumber + " = " + result);
	}
	else if(operator == '-'){
	int result = firstNumber - secondNumber;
	System.out.print(firstNumber + " - " + secondNumber + " = " + result);
	}
}
}