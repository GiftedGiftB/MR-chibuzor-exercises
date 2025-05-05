// Declare a class name
// Create main method
// initialise scanner by also importing it
// prompt the user to enter the weight of the package
//display the shipping cost 
//use the if method to get the greater number
//if the weight is greater than 50 display a message "the package cannot be shipped".


import java.util.Scanner;
public class WeightOfPackage{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	System.out.print("Enter the weight of the package: ");
	double weightOfP = inputScanner.nextDouble();

	double shippingCost1 = 3.5;
	double shippingCost2 = 5.5;
	double shippingCost3 = 8.5;
	double shippingCost4 = 10.5;
	double shippingCost5 = 50;

	if(weightOfP <= 1){
	System.out.printf("The shipping cost is: $%f%n", shippingCost1);
	} 
	else if(weightOfP <= 3){
	System.out.printf("the shipping cost is: $%f%n", shippingCost2);
	} 
	else if(weightOfP <= 10){
	System.out.printf("the shipping cost is: $%f%n", shippingCost3);
	} 
	else if(weightOfP <= 20){
	System.out.printf("the shipping cost is: $%f%n", shippingCost4);	
	} 
	else{
	System.out.print("The package cannot be shipped");	
	}
}
}