import java.util.Scanner;
public class DoWhileLoop{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int counter = 0;

	do{
	System.out.print("Enter first number: ");
	int firstNumber = scan.nextInt();
	counter = counter + 1;
	
	//System.out.print("Enter first number: ");
	//int firstNumber = scan.nextInt();
	}
	while(counter <= 1);

  }
}