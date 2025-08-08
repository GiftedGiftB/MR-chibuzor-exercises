import java.util.Scanner;
public class GreetingChooser1{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter your name: ");
	String name = scan.nextLine();

	if(name.equals("Alex")){
	System.out.print("Hello,friend!");
	} else{
	System.out.print("Hi, stranger!");
	}

}

}