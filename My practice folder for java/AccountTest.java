//import java.util.Scanner;
public class AccountTest{
	public static void main(String[] args){
	java.util.Scanner input = new java.util.Scanner(System.in);
//Scanner input = new Scanner(System.in);

	Account myAccount = new Account();

	System.out.printf("initial name is: %s%n%n", myAccount.getName());

	System.out.print("please enter the name: ");
	String theName = input.nextLine();
	myAccount.setName(theName);
	System.out.println();

	System.out.printf("Name in object myAccout is: %s%n", myAccount.getName());


 }
}