import java.util.Scanner;
public class TwoLargestNumber{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	int counter = 1;
	int largestValue = 0;
	int secondLargestValue = 0;

	while(counter <= 10){
	
	System.out.print("Enter a number");
	int userNumber = inputScanner.nextInt();

	if(userNumber > largestNumber){

	largestNumber = userNumber;
	
	}
	else if(secondLargestValue > userNumber){
	largestNumber = secondLargestValue;
	secondLargestValue = userNumber; 
	}
	counter++;
	}
	System.out.print("The largest number is: "+ largestNumber);

	System.out.print("The second largest number is: "+ secondLargestValue);
 
 }

}