import java.util.Random;
import java.util.Scanner;
public class Question2{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);
	Random inputRandom = new Random();


	System.out.print("Enter number between 1 to 10: ");
	int userNumber = inputScanner.nextInt();

	int gameNumber= inputRandom.nextInt(11);

	if(gameNumber == 1 && userNumber > 1){
	System.out.print("Too high");
	}
	else if(gameNumber == 2 && userNumber > 2){
	System.out.print("Too high");
	}
	else if(gameNumber == 3 && userNumber > 3){
	System.out.print("Too high");
	}
	else if(gameNumber == 4 && userNumber > 4){
	System.out.print("Too high");
	}
	else if(gameNumber == 5 && userNumber > 5){
	System.out.print("Too high");
	}
	else if(gameNumber == 6 && userNumber > 6){
	System.out.print("Too high");
	}
	else if(gameNumber == 7 && userNumber > 7){
	System.out.print("Too high");
	}
	else if(gameNumber == 8 && userNumber > 8){
	System.out.print("Too high");
	}
	else if(gameNumber == 9 && userNumber > 9){
	System.out.print("Too high");
	}
	else if(gameNumber == 10 && userNumber > 10){
	System.out.print("Too high");
	}
	if(gameNumber == 1 && userNumber < 1){
	System.out.print("Too low");
	}
	if(gameNumber == 2 && userNumber < 2){
	System.out.print("Too low");
	}
	else{
	System.out.print("invalid");
	}

}
}