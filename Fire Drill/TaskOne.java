import java.util.Scanner;
public class TaskOne{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int counter = 0;
	int sum = 0;
	
	System.out.print("Enter number of scores: ");
	int userInput = input.nextInt();

	while(counter != userInput) {

		System.out.print("Enter score: ");
		int score = input.nextInt();
		counter++;
		sum += score;
	}
		System.out.print("The score is: " + sum);


}
}