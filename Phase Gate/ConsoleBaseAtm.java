import java.util.Scanner;
public class ConsoleBaseAtm{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter amount: ");
	double currentBalance = input.nextInt();

	double RemainingBalance = 0;

	int witdrawalFee = 100;

	System.out.print("""

		Welcome to Semicolon Bank ATM

	""");

	System.out.println("Your current balance is: " + currentBalance);
	System.out.println();	
	
	System.out.print("Enter withdrawal amount: ");
	int userWithdraw = input.nextInt();

	
	if(userWithdraw < 100){
	System.out.print("Invalid Amount");
	}
	if(userWithdraw > 20000){
	System.out.print("20,000 per transaction only");
	}
	else {
	System.out.println();
	
	RemainingBalance = currentBalance - userWithdraw - witdrawalFee;
	System.out.println("Successful");
	}
	System.out.print("Your balance is: " + RemainingBalance);

	

	}
}
