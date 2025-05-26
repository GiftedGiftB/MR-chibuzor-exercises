import java.util.Scanner;
public class SetOfInteger{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter number");
	int number1 = giftScanner.nextInt();
	int number2 = giftScanner.nextInt();
	int number3 = giftScanner.nextInt();
	int number4 = giftScanner.nextInt();

	int evenInteger = 0;
	int oddInteger = 0;

	if (number1 % 2 == 0){
	evenInteger = evenInteger + number1;
}
	if (number1 % 2 != 0){
	oddInteger = oddInteger + number1;
}
 	if (number2 % 2 == 0){
	evenInteger = evenInteger + number2;
}
	if (number2 % 2 != 0){
	oddInteger = oddInteger + number2;
}
	if (number3 % 2 == 0){
	evenInteger = evenInteger + number3;
}
	if (number3 % 2 != 0){
	oddInteger = oddInteger + number3;
}
	if (number4 % 2 == 0){
	evenInteger = evenInteger + number4;
}
	if (number4 % 2 != 0){
	oddInteger = oddInteger + number4;
}
	System.out.print("Sum of evenInteger is :" + evenInteger);
 
	System.out.print("\nSum of  oddInteger is :" + oddInteger);
 }
}