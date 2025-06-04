import java.util.Scanner;
public class GreatPyramid{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Estimated number of stones used: ");
	double numberOfStones = inputScanner.nextDouble();

	System.out.print("Average weight of each stone: ");
	double weightOfStone = inputScanner.nextDouble();

	System.out.print("Number of year taking to build the pyramid: ");
	double numberOfYears = inputScanner.nextDouble();

	double totalWeight = numberOfStones * weightOfStone;
	double weightPerYear = totalWeight / numberOfYears;
	double weightPerHour = (totalWeight / numberOfYears * 24)* 365;
	double weightPerMinute = (totalWeight / numberOfYears * 60)* 365;

	System.out.printf("%f%n ", totalWeight);
	System.out.printf("%f%n ", weightPerYear);	
	System.out.printf("%f%n ", weightPerHour);
	System.out.printf("%f%n ", weightPerHour);
	System.out.printf("%f%n ", weightPerMinute);

 }

}