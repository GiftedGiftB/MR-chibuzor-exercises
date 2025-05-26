import java.util.Scanner;
public class MultiplicationAB{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	

	System.out.print("Enter a number: ");
	int a = input.nextInt();

	System.out.print("Enter a number: ");
	int b = input.nextInt();
		System.out.print(" ");
	for(int number = a; number <= 9; number++){
		for(int number1 = a; number1 <= 9; number1++){
			System.out.print(number * number1 + " ");
	}
		System.out.println();
 	}


}
}