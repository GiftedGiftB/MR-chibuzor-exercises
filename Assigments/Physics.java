import java.util.Scanner;
public class Physics{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter starting velocity in meters/second :");
	double number1 = giftScanner.nextDouble();

	System.out.print("Enter ending velocity in meter/second :");
	double number2 = giftScanner.nextDouble();

	System.out.print("Enter time span in seconds :");
	double number3 = giftScanner.nextDouble();

	double startingVelocity0 = number1;
	double endingVelocity1 = number2;
	double time = number3;

	double acceleration = (endingVelocity1 - startingVelocity0) / time;
	System.out.printf("%.4f", acceleration);

  }
}