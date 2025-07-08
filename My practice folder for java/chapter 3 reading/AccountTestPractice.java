import java.util.Scanner;
public class AccountTestPractice{
	public static void main(String[] args){
	
 
	/* Account myAccount = new Account();

	System.out.printf("Initial name is: %s%n%n", myAccount.getName());

	System.out.print("please enter the name: ");
	String theName = input.nextLine();
	myAccount.setName(theName);
	System.out.println();

	System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName()); */


	Account account1 = new Account("jane Green", 50.00);
	Account account2 = new Account("john Blue", -7.53);

	System.out.printf("%s balance: $%.2f%n", account1.getName(),  account1.getBalance());

	System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

	Scanner input = new Scanner(System.in);

	System.out.print("Enter deposit amount for account1: ");
	double depositAmount = input.nextDouble();
	
	System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
	account1.deposit(depositAmount);

	System.out.printf("%s balance: $ %n",account1.getName(), account1.getBalance());

	System.out.printf("%s balance: $ %n",account2.getName(), account2.getBalance()); 



                 
 }
} 