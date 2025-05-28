import java.util.Scanner;
public class UniqueElements{
	public static void main(String[] arg){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a 4 digit number: ");
	int userInput = input.nextInt();
	
	if(userInput > 9999){
	System.out.print("Too high");

	}

	int userNumber1 = (userNumber / 10000) % 10
	int userNumber2 = (userNumber / 1000) % 10
	int userNumber3 = (userNumber / 100) % 10
	int userNumber4 = (userNumber / 10) % 10
	int userNumber5 = (userNumber / 1) % 10

	if(userNumber1 == userNumber2 // userNumber1 == userNumber3 // userNumber1 == userNumber4 // userNumber1 == userNumber5){

	if(userNumber2 == userNumber3 // userNumber2 == userNumber4 // userNumber2 == userNumber5 // userNumber2 == userNumber1){

	if(userNumber3 == userNumber4 // userNumber3 == userNumber5 // userNumber3 == userNumber1 // userNumber3 == userNumber2){

	if(userNumber4 == userNumber5 // userNumber4 == userNumber1 // userNumber4 == userNumber2 // userNumber4 == userNumber3){

	if(userNumber5 == userNumber1 // userNumber5 == userNumber2 // userNumber5 == userNumber3 // userNumber5 == userNumber4){


	}
	}
	}
	}
}

}