import java.util.Random;
import java.util.Scanner;
public class Game{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);
	Random inputRandom = new Random();

	System.out.print("Enter number between 1 to 10");
	int userNumber = inputScanner.nextInt();
	
	int userNumber1 = inputRandom.nextInt(11);

	int number1 = One;
	int number2 = Two;
	int number3 = Three;
	int number4 = Four;
	int number5 = Five;
	int number6 = Six;
	int number7 = Seven;
	int number8 = Eight;
	int number9 = Nine;
	int number10 = Ten;

	if(userNumber == 1){
	System.out.println("You choose: number1");
	}
	if(userNumber == 2){
	System.out.println("You choose: number2");
	}
	if(userNumber == 3){
	System.out.println("You choose: number3");
	}
	if(userNumber == 4){
	System.out.println("You choose: number4");
	}
	if(userNumber == 5){
	System.out.println("You choose: number5");
	}
	if(userNumber == 6){
	System.out.println("You choose: number6");
	}
	if(userNumber == 7){
	System.out.println("You choose: number7");
	}
	if(userNumber == 8){
	System.out.println("You choose: number8");
	}
	if(userNumber == 9){
	System.out.println("You choose: number9");
	}
	if(userNumber == 10){
	System.out.println("You choose: number10");
	} else {
	System.out.print("You are wrong");
	}

}
}