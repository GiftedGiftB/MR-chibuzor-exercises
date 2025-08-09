import java.util.Scanner;
public class PasswordChecker7{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	String password = "secret123";

	System.out.print("Enter a password: ");
	String userInput = input.next();

	if(userInput.equals(password)){
	System.out.print("Access granted! Welcome!");
	} else{
	System.out.print("Access denied!");
	}
}
 
}