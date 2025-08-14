import java.util.Scanner;
public class AgeAndHeightCheck31{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	

	System.out.print("Enter your age: ");
	int userAge = input.nextInt();

	System.out.print("Enter your height: ");
	int userHeight = input.nextInt();

	if(userAge >= 12 && userHeight >= 140){
		System.out.print("Ride allowed!");
	}
	else if (userAge < 12 && userHeight > 140){
		System.out.print("Too young");
	}
	else{
		System.out.print("Too short");
	}
}

}