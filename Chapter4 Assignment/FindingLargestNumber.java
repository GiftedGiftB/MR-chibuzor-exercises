//initialise counter, largest number as variable to zero
//prompt the user to enter a number that iterate 10 times
//if user number is greater than largest number which was initialised to zero then


import java.util.Scanner;
public class FindingLargestNumber{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	int counter = 0;
	int largestNumber = 0;

	while(counter != 10){
	
	System.out.print("Enter a number: ");
	int integerNumber = inputScanner.nextInt();

	if(integerNumber > largestNumber){

	largestNumber = integerNumber;
	
	}
	counter++;
	}
	System.out.print("The largest number is: "+ largestNumber);
 }

}