import java.util.Scanner;
public class TrafficLight9{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a color like green or red or yellow: ");
	String userChoice = input.nextLine().toLowerCase();

		if(userChoice.equals("green")){
			System.out.println("Go!");
		}
		else if(userChoice.equals("red")){
			System.out.println("Stod!");
		} else {
			System.out.println("Wait!");
		}

}
}