import java.util.Scanner;
public class PositiveAndNegative{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number:");
	int firstNumber = scanner.nextInt();

	if(firstNumber > 0 ){
	System.out.println("Positive!!");
	}
	else{

	System.out.println("Negative!!");

	}
	System.out.print("Enter a number:");
	int secondNumber = scanner.nextInt();
	if(secondNumber  > 0 ){
	System.out.println("Positive!!");
	}
	else{

	System.out.println("Negative!!");

	}
  }
}
	