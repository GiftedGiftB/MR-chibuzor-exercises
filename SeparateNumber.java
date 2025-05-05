import java.util.Scanner;
public class SeparateNumber{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter five digits number: ");
	int Number = giftScanner.nextInt();

	int divide = (Number / 10000) % 10000;

	int divide1 = (Number / 1000) % 10;

	int divide2 = (Number / 100) % 10;

	int divide3 = (Number / 10) % 10;

	int divide4 = (Number / 1) % 10;

	System.out.printf("answer is: %d   %d    %d   %d   %d%n", divide, divide1, divide2, divide3, divide4);
	 
  }
}