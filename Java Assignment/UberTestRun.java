import java.util.Scanner;
public class UberTestRun{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of copy: ");
	int copyNumber = input.nextInt();

	int pricePerCopy = UberAppPrice.TestDriller(copyNumber);

	System.out.print("The copy price is: " + pricePerCopy);
}
}