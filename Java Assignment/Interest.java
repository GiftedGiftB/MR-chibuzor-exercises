import java.util.Scanner;
public class Interest{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter balance is :");
	double number1 = giftScanner.nextDouble();

	System.out.print("annual percentage is :");
	double number2 = giftScanner.nextDouble();

	double interest = number1 * (number2/1200);
	System.out.printf("The interest is %.5f", interest);

  }
}