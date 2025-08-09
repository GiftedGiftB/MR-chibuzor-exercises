import java.util.Scanner;
public class PosiveOrNegative11{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int userChoice = input.nextInt();

	if(userChoice > 0){
	System.out.print("Positive!");
	} else if(userChoice == 0){
	System.out.print("Zero!");
	}else {
	System.out.print("Negative!");
	}

}

}