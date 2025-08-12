import java.util.Scanner;
public class TaskNine{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	

	int sum = 0;
	double average = 0;
	int counter = 0;

	for(int count = 1; count <= 10; count++){
		System.out.print("Enter score: ");
		int score = input.nextInt();
	while(score < 0 || score > 10){
	System.out.println("Enter number between 1 - 10");
	score = input.nextInt();
	}
	if(score % 2 == 0){
		counter++;
		sum += score;
		
	}
	}
	System.out.println("The sum is: " + sum);
	

		
	
}

}