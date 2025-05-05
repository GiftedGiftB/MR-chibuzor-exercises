import java.util.Scanner;
public class ComparingIntegers{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter number : ");
	int number = giftScanner.nextInt();

	int itSquare = number * number;
	
	if (number > 100){
	System.out.printf("%d > %d%n", number, 100);
	if (itSquare > 100);
	System.out.printf("%d > %d%n", itSquare, 100);
}
	if (number == 100){
	System.out.printf("%d == %d%n", number, 100);
	if (itSquare == 100);
	System.out.printf("%d == %d%n", itSquare, 100);
}
	if (number != 100){
	System.out.printf("%d != %d%n", number, 100);
	if (itSquare != 100);
	System.out.printf("%d != %d%n", itSquare, 100);
}
	if (number < 100){
	System.out.printf("%d < %d%n", number, 100);
	if (itSquare < 100);
	System.out.printf("%d < %d%n", itSquare, 100);
}
  }

}