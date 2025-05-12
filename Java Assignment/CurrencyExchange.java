// Declare a class name
// Create main method
// initialise scanner by also importing it
// prompt the user to enter the exchhange rate from currency in U.S dollars to chinese RMB.
// promt the user to enter 0 to convert from U.S dollars to chinese RMB and U.S dollars 
// prompt the user to enter the amount in U.S dollars or chinise RMB to convert it to chinese RMB or U.S dollars 



import java.util.Scanner;
public class CurrencyExchange{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter the exchhange rate from currency in U.S dollars to chinese RMB: ");
	double exchangeRate = inputScanner.nextDouble();



	System.out.print("To convert from U.S dollars to chinese RMB enter 0 or 1 from chinese RMB to U.S dollars: ");
	double convertTo = inputScanner.nextDouble();

	if(convertTo == 0){
	System.out.print("Enter dollar amount: ");
	double dollarAmount = inputScanner.nextDouble();
	double chineseRMB = dollarAmount * exchangeRate;
	System.out.printf("The chineseRMB is $%f%n: ", chineseRMB );
	}
	if(convertTo == 1){
	System.out.print("Enter chinese RMB ");
	double chineseRMB1 = inputScanner.nextInt();
	double dollarAmount1 = chineseRMB1 * exchangeRate;
	System.out.printf("The dollarAmount1 is $%f%n: ", dollarAmount1);
	}
}
}
