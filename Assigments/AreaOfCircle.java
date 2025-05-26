import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter radius of a circle :");
	float radiusC = inputScanner.nextFloat();
	
	System.out.printf("diameter is :%f%n", 2 * radiusC);
	System.out.printf("circumference is :%f%n", 2 * 3.14159 * radiusC);
	System.out.printf("area :%f%n", 3.14159 * (radiusC * radiusC));
	

  }

}