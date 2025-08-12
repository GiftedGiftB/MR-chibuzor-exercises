import java.util.Scanner;
public class TaskFour{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	

	int sum = 0;
	double average = 0;

	for(int count = 2; count <= 10; count += 2){
		System.out.print("Enter score: ");
		int score = input.nextInt();
		sum += score;
	}

	System.out.println("Sum is: " + sum);


	
	
}

}