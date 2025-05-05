import java.util.Scanner;
public class Energy{
	public static void main(String[] ars){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter water in kilograms :");
	double number1 = giftScanner.nextDouble();

	System.out.print("Enter initial temperature of the water :");
	double number2 = giftScanner.nextDouble();

	System.out.print("Enter final temperature of the water :");
	double number3 = giftScanner.nextDouble();

	double Q = number1 * (number3 - number2) *4184;
	System.out.printf("The energy needed is %.1f:", Q);

}
}