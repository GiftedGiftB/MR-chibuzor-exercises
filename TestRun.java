import java.util.Scanner;
public class TestRun{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	// number 1

	//System.out.print("The even number is: "+ Kata.isEven(11));
	
	// number 2

	//System.out.print(Kata.isPrimeNumber(5)); 

	// number 6  

	System.out.print("Enter a number: ");
	int number = input.nextInt();
	System.out.print(Kata.isSquare(number));
}
}
