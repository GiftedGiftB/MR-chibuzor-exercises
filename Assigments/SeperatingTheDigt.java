import java.util.Scanner;
public class SeperatingTheDigt{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);
	
	System.out.print("Enter five digits");
	int number = inputScanner.nextInt();

	int divide = number / 10000;
	int modulus = divide % 10;

	int divide1 = number / 1000;
	int modulus1 = divide1 % 10;

	int divide2 = number / 100;
	int modulus2 =divide2 % 10;

	int divide3 = number / 10;
	int modulus3 =divide3 % 10;

	int divide4 = number / 1;
	int modulus4 = divide4 % 10;

	System.out.printf("answer is: %d   %d    %d   %d   %d%n", modulus, modulus1, modulus2, modulus3, modulus4);
	 
  }
}