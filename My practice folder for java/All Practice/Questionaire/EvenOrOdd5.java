import java.util.Scanner;
public class EvenOrOdd5{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int userInput = input.nextInt();
	
	if(userInput % 2 == 0){
	System.out.print("Even!");
	} else{
	System.out.print("Odd!");
	}
	System.out.println();

}

}