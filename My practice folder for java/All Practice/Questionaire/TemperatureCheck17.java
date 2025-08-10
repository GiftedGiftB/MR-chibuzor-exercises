import java.util.Scanner;
public class TemperatureCheck17{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter temperature e.g 25: ");
	int userInput = input.nextInt();
	
	if(userInput == 30){
	System.out.print("Hot!");
	} else if(userInput > 15){
	System.out.print("Nice!");
	} else{
	System.out.print("Cold!");
	}
}

}