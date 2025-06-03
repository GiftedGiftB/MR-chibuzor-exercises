import java.util.Scanner;
import java.util.Random;
public class SubtractionProblem{
	public static void main(String[] args){
	Random rand = new Random();
	Scanner input = new Scanner(System.in);

	int tempNumber = 0;

	for(int count = 0; count < 3; count++){

	int randChoice1 = rand.nextInt(100) + 1;
	int randChoice2 = rand.nextInt(100) + 1;

	if(randChoice1 == randChoice2){
		randChoice1 = randChoice2;
	}
	else if(randChoice1 < randChoice2){
		tempNumber = randChoice1;
		randChoice1 = randChoice2;
		randChoice2 = tempNumber;
	}

	int total = randChoice1 - randChoice2;
	
	System.out.println(randChoice1 + " " + randChoice2);
	System.out.println(total);
		

	System.out.print("Whats the answer: ");
	int userAnswer = input.nextInt();
	
	if(userAnswer == total){
	System.out.print("You are correct");
	}
	else if(userAnswer != total){
	System.out.print("You wrong");
	}
	}

}
}