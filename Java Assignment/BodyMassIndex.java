import java.util.Scanner;
public class BodyMassIndex{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter weight in pounds: ");
	double number1 = giftScanner.nextDouble();

	System.out.print("Enter height in inches: ");
	double number2 = giftScanner.nextDouble();

	double bmi = (number1 * 703) / (number2 * number2);
	System.out.printf("Body mass index is: %.4f", bmi);

  }

}