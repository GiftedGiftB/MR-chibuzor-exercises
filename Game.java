import java.util.Scanner;
public class Game{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	
	System.out.print("Enter between 1 to 10: ");
	int number = inputScanner.nextInt();

	if(number == 1){
	System.out.print("one");
	}
	else if(number == 2){
	System.out.print("two");
	} 
	else if(number == 3){
	System.out.print("three");
	}
	else if(number == 4){
	System.out.print("three");
	}
	else if(number == 4){
	System.out.print("four");
	}
	else if(number == 5){
	System.out.print("five");
	}
	else if(number == 6){
	System.out.print("six");
	}
	else if(number == 7){
	System.out.print("seven");
	}
	else if(number == 8){
	System.out.print("eight");
	}
	else if(number == 9){
	System.out.print("nine");
	}
	else if(number == 10){
	System.out.print("ten");
	}
	else{
	System.out.print("invalid");
	}
	
}
}