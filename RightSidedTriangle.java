import java.util.Scanner;
public class RightSidedTriangle{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int triangle = input.nextInt();
	
	for(int rows = 1; rows <= triangle; rows++){
		for(int columns = 1; columns <=rows; columns++){
			System.out.print("*");
		}
	System.out.println();
	}
}
}