import java.util.Scanner;
public class InGroup{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int number1 = giftScanner.nextInt();

	System.out.print("Enter second number : ");
	int number2 = giftScanner.nextInt();

	System.out.print("Enter third number : ");
	int number3 = giftScanner.nextInt();

	System.out.print("Enter fourth number : ");
	int number4 = giftScanner.nextInt();

	System.out.print("Enter fifth number : ");
	int number5 = giftScanner.nextInt();

	if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5){ 
	System.out.printf("%d > %d && %d > %d && %d > %d && %d > %d%n", number1, number2, number1, number3, number1, number4, number1, number5);
}
	if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5){ 
	System.out.printf("%d < %d && %d < %d && %d < %d && %d < %d%n", number1, number2, number1, number3, number1, number4, number1, number5);
}
	if (number2 > number3 && number2 > number4 && number2 > number5 && number2 > number1){ 
	System.out.printf("%d > %d && %d > %d && %d > %d && %d > %d%n", number2, number3, number2, number4, number2, number5, number2, number1);
}
	if (number2 < number3 && number2 < number4 && number2 < number5 && number2 < number1){
	System.out.printf("%d < %d && %d < %d && %d < %d && %d < %d%n", number2, number3, number2, number4, number2, number5, number2, number1);
}
	if (number3 > number4 && number3 > number5 && number3 > number1 && number3 > number2){
	System.out.printf("%d > %d && %d > %d && %d > %d && %d > %d%n", number3, number4, number3, number5, number3, number1, number3, number2);
}
	if (number3 < number4 && number3 < number5 && number3 < number1 && number3 < number2){
	System.out.printf("%d < %d && %d < %d && %d < %d && %d < %d%n", number3, number4, number3, number5, number3, number1, number3, number2);
}
	if (number4 > number5 && number4 > number1 && number4 > number2 && number4 > number3){
	System.out.printf("%d > %d && %d > %d && %d > %d && %d > %d%n", number4, number5, number4, number1, number4, number2, number4, number3);
}
	if (number4 < number5 && number4 < number1 && number4 < number2 && number4 < number3){
	System.out.printf("%d < %d && %d < %d && %d < %d && %d < %d%n", number4, number5, number4, number1, number4, number2, number4, number3);
}
	if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4){
	System.out.printf("%d > %d && %d > %d && %d > %d && %d > %d%n", number5, number1, number5, number2, number5, number3, number5, number4);
}
	if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4){
	System.out.printf("%d < %d && %d < %d && %d < %d && %d < %d%n", number5, number1, number5, number2, number5, number3, number5, number4);
}
  }
}