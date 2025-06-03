import java.util.Scanner;
import java.util.Random;
public class SubtractionProblem{
	public static void main(String[] args){
	Random rand = new Random();
	Scanner input = new Scanner(System.in);

	int tempNumber = 0;
	int failCounter =0;
	int passCounter = 0;
	int count = 0;

	for(count = 0; count < 3; count++){

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
	System.out.println("You are correct");
	passCounter++;
	}
	else if(userAnswer != total){
	System.out.println("You wrong");
	total = randChoice1 - randChoice2;
	
	System.out.print("Whats the answer: ");
	userAnswer = input.nextInt();
	failCounter++;
	}
	}
	System.out.println("You failed " + failCounter + " question " + " passed " + passCounter + " questions " + " and you attempted " + count + " questions all together");
	}
}