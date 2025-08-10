import java.util.Scanner;
public class PrintYourName18{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your name: ");
	String userName = input.nextLine();

	for(int count = 1; count <= 3; count++){
	System.out.println(userName + "!");
	}

}

}