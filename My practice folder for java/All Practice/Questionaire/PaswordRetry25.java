import java.util.Scanner;
public class PaswordRetry25{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	String correctPassword = "gift123";
	String userInput = " ";
	int count = 0;

while(userInput != count){
	System.out.print("Enter your Password: ");
	userInput = input.nextLine();

	if(userInput.equals(correctPassword)){
		System.out.print("Success!");
		break;
	}
	else {
		System.out.println("Try again");
		count++;
	}
	}

}

}