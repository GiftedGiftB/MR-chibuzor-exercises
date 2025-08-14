import java.util.Scanner;
public class AgeAndHeightCheckFunction{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	

	System.out.print("Enter your age: ");
	int userAge = input.nextInt();

	System.out.print("Enter your height: ");
	int userHeight = input.nextInt();

	ageAndHeightCheck(userAge, userHeight);

}
	public static void ageAndHeightCheck(int age, int height){
	
	if(age >= 12 && height >= 140){
		System.out.print("Ride allowed!");
	}
	else if (age < 12 && height > 140){
		System.out.print("Too young");
	}
	else{
		System.out.print("Too short");
	}


	}
}