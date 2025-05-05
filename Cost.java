import java.util.Scanner;
public class Cost{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter distance to drive :");
	double number1 = giftScanner.nextDouble();

	System.out.print("Enter fuel efficiency :");
	double number2 = giftScanner.nextDouble();

	System.out.print("Enter price per gallon :");
	double number3 = giftScanner.nextDouble();

	double costOfTrip = number2 + number3 / (number1);
	System.out.printf("Cost of the trip is %.2f", costOfTrip);


  }
}