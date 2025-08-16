import java.util.Scanner;
public class TicketPrice35{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	final int adultPrice = 10;
	final int childPrice = 5;
	
	System.out.print("Enter your age: ");
	int userAge = input.nextInt();

	if(userAge >= 18){
		System.out.print("The adult price is $10");
	}
	if(userAge < 18){
		System.out.print("The child price is $5");
	}
}
}