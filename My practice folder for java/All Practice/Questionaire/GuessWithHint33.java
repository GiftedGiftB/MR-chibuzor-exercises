import java.util.Scanner;
public class GuessWithHint33{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	final int answer = 25;
	int userNumber = 0;

while(userNumber != answer){
	System.out.print("Enter a number: ");
	userNumber = input.nextInt();

	if(userNumber == 25){
		System.out.print("Correct");
	}
	else if(userNumber > 25){
		System.out.println("Too high");
	}
	else{
		System.out.println("Too low");
	}
	}


}
}