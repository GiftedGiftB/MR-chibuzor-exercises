import java.util.Scanner;
    public class ProductOfNumber{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = inputScanner.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = inputScanner.nextInt();

	int multipliedN = firstNumber * secondNumber;

	System.out.printf("The sum total is: %d * %d = %d%n", firstNumber, secondNumber, multipliedN);

}
}