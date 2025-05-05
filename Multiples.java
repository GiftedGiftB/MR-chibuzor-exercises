import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter first number :");
	int number1 = giftScanner.nextInt();

	System.out.print("Enter second number :");
	int number2 = giftScanner.nextInt();

	int tripledNumber = number1 + number1 + number1;
	int doubledNumber = number2 + number2;

	int remainderNumber = tripledNumber % doubledNumber;

	if (remainderNumber == 0);{
	System.out.printf("the result is %d == %d%n",remainderNumber, 0);
}
	if (remainderNumber != 0){
	System.out.printf("the number if not zero is : %d != %d%n", remainderNumber, 0);
}
  }
}