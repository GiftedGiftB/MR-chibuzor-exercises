import java.util.Scanner;
public class EnergyConvert{
	public static void main(String[] ars){
	Scanner giftScanner = new Scanner(System.in);
	
	System.out.print("Enter number in feet :");
	double number = giftScanner.nextDouble();

	double result = number * 0.305;
	System.out.printf("result is %.4f", result);
}
}