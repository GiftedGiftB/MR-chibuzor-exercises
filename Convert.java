import java.util.Scanner;
public class Convert{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter a number in pounds :");
	double number1 = giftScanner.nextDouble();

	double result = number1 * 0.454;
	System.out.printf("Result is %.3f", result);

  }

}