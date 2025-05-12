import java.util.Scanner;
public class SeparatingDigit{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter a number with five digits : ");
	int enteredNumber1 = giftScanner.nextInt();

	int num2 = enteredNumber1 / 10;
	int num4 = num2 / 10;
	int num6 = num4 / 10;

	int num1 = enteredNumber1 % 10;
	int num3 = num2 % 10;
	int num5 = num4 % 10;
	int num7 = num6 % 10;
	int num8 = num6 / 10;
	
	int num9 = num1 + num3 + num5 + num7 + num8;
	System.out.printf("%d   %d   %d   %d   %d%n",num8, num7, num5, num3, num1);
	System.out.printf("%d%n", num9);	
  }
}