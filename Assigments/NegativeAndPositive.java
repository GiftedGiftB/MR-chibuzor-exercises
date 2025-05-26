import java.util.Scanner;
public class NegativeAndPositive{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = inputScanner.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = inputScanner.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = inputScanner.nextInt();

	System.out.print("Enter forth number: ");
	int forthNumber = inputScanner.nextInt();

	System.out.print("Enter fifth number: ");
	int fifthNumber = inputScanner.nextInt();

	if (firstNumber < 0){
	System.out.println("the first Number is lesser than zero: ");
}
	if (firstNumber > 0){
	System.out.println("the first Number is greater than zero: ");
}
	if (firstNumber == 0){
	System.out.println("the first Number is equal to zero: ");
}
	if (secondNumber < 0){
	System.out.println("the second Number is lesser than zero: ");
}
	if (secondNumber > 0){
	System.out.println("the second Number is greater than zero: ");
}
	if (secondNumber == 0){
	System.out.println("the second Number  is equal to zero");
} 
	if (thirdNumber < 0){
	System.out.println("the third Number is lesser than zero: ");
}
	if (thirdNumber > 0){
	System.out.println("the third Number is greater than zero: ");
}
	if (thirdNumber == 0){
	System.out.println("the third Number is equal to zero");
}
	if (forthNumber < 0){
	System.out.println("the forth Number is lesser than zero: ");
}
	if (forthNumber > 0){
	System.out.println("the forth Number is greater than zero: ");
}
	if (forthNumber == 0){
	System.out.println("the forth Number  is equal to zero");
}
	if (fifthNumber < 0){
	System.out.println("the fifth Number is lesser than zero: ");
}
	if (fifthNumber > 0){
	System.out.println("the fifth Number is greater than zero: ");
}
	if (fifthNumber == 0){
	System.out.println("the fifth Number is equal to zero: ");
}


  }
}