import java.util.Scanner;
public class InvestmentValue{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter investment amount :");
	double iA = giftScanner.nextDouble();

	System.out.print("Enter annual interest rate :");
	double aIr = giftScanner.nextDouble();

	System.out.print("Enter number of years :");
	double nOy = giftScanner.nextDouble();

	double value1 = 1 + (aIr / 100 / 12);

	double futureInvestmentValue = iA * Math.pow(value1, nOy * 12);
	System.out.printf("Accumulated value is :$%.2f", futureInvestmentValue); 
}

}