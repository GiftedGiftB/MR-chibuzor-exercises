import java.util.Scanner;
public class LimitCalculator{
	public static void main(String[] args){
	Scanner scan = new Scanner (System.in);

	for(int counter = 0; counter >= 0; counter++) {

	System.out.print("Enter account number: ");
	int accountNumber = scan.nextInt();

	System.out.print("Enter balance at the beginning of the month: ");
	int beginingBalance = scan.nextInt();

	System.out.print("Enter the total of all items charged by the customer this month: ");
	int chargedItemsAmount = scan.nextInt();

	System.out.print("Enter the total of all credits applied to the customer's account ths month: ");
	int creditApplied = scan.nextInt();

	System.out.print("Enter allowed credit limit: ");
	int creditLimit = scan.nextInt();

	long newBalance = beginingBalance + chargedItemsAmount - creditApplied;

	System.out.print("The new balance is: ");
}
}

}