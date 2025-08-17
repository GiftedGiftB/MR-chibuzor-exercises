import java.util.Scanner;
public class FactorCounter36{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int counter = 0;

	System.out.print("Enter a number: ");
	int userNumber = input.nextInt();

	for(int count = 1; count <= userNumber; count++){
		if(userNumber % count == 0){
			counter++;
		}
	}
	System.out.print(counter);
	
}

}