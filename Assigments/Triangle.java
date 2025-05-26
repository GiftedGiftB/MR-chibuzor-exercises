import java.util.Scanner;
public class Triangle{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number that represent the length of the base of triangle: ");
		int triangle = input.nextInt();

	for(int i = 1; i <= triangle; i++){
		for(int j = 1; j <= i; j++){
			System.out.print("*");
		
	}
				System.out.println();
	}
}
}

