import java.util.Scanner;
public class Divisible{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter number");
	int number = giftScanner.nextInt();

	int divisibleNumber = number % 3;

	if (divisibleNumber == 0){
	System.out.printf("It is divisible by 3: %d == %d%n", divisibleNumber, 0);
}
	if (divisibleNumber > 0){
	System.out.printf("%d > %d%n", divisibleNumber, 0);
}
	if (divisibleNumber < 0){
	System.out.printf("%d < %d%n", divisibleNumber, 0);
}


  }
}