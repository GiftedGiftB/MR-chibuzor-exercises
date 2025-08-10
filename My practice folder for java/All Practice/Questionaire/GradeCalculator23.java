import java.util.Scanner;
public class GradeCalculator23{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter Test score 0 - 100: ");
	int userInput = input.nextInt();

	if(userInput >= 90){
		System.out.print("A");
	}
	else if(userInput >= 80){
		System.out.print("B");
	}
	else if(userInput >= 70){
		System.out.print("C");
	}
	else {
		System.out.print("F");
	}
}
}