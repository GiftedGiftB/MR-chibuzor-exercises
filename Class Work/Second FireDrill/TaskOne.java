import java.util.Scanner;
public class TaskOne{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int sum = 0;

	System.out.print("Enter score: ");
	int score = input.nextInt();

	for(int count = 1; count <= 10; count++){
		sum += score;
	}
	System.out.print(sum);
}

}