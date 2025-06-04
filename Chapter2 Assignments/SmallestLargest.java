import java.util.Scanner;
public class SmallestLargest{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int number1 = giftScanner.nextInt();

	System.out.print("Enter second number : ");
	int number2 = giftScanner.nextInt();

	System.out.print("Enter third integer : ");
	int number3 = giftScanner.nextInt();

	int sum = number1 + number2 + number3;
	System.out.printf("their sum is %d%n", sum);

	int divisionOfSum =sum / 3;
	System.out.printf("average is %d%n", divisionOfSum);

	int product = number1 * number2 * number3;
	System.out.printf("their product is %d%n", product);

	if (number1 < number2){ 
	System.out.printf("%d %d%n", number1, number2);
}	
	if (number1 < number3){
	System.out.printf("%d < %d%n",number1, number3);
}
	if (number2 < number3){
	System.out.printf("%d < %d%n", number2, number3);
}
	if (number2 < number1){
	System.out.printf("%d < %d%n", number2, number1);
}
	if (number3 < number1){
	System.out.printf("%d < %d%n", number3, number1);
}
	if (number1 > number2){ 
	System.out.printf("%d > %d%n", number1, number2);
}	
	if (number1 > number3){
	System.out.printf("%d > %d%n",number1, number3);
}
	if (number2 > number3){
	System.out.printf("%d > %d%n", number2, number3);
}
	if (number2 > number1){
	System.out.printf("%d %d%n", number2, number1);
}
	if (number3 > number1){
	System.out.printf("%d %d%n", number3, number1);
}
 }
}