import java.util.Scanner;
public class PaswordRetry25{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	String correctPassword = "gift123";
	String userInput = " ";
	int count = 0;
	int maximumCount = 2;

while(userInput != correctPassword){
	System.out.print("Enter your Password: ");
	userInput = input.nextLine();

	if(userInput.equals(correctPassword)){
		System.out.print("Success!");
		break;
	}
	else if(count < maximumCount){
		System.out.println("Try again");
		count++;
	}
	else {
		System.out.print("Locked out");
		break;
	}
	}

}

}