import java.util.Scanner;
    public class WorldPopulation{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);	

	System.out.println("Enter current world population number: ");
	double currentWpN = inputScanner.nextDouble();

	System.out.print("Enter annual world population growthn rate: ");
	double annualGr = inputScanner.nextDouble();

	double growthRate = annualGr / 100;

	double firstYear = currentWpN * (1 + annualGr);

	double secondYear = firstYear * (1 + annualGr) * (1 + annualGr);

	double thirdYear = secondYear * (1 + annualGr) * (1 + annualGr) * (1 + annualGr);

	double forthYear = thirdYear * (1 + annualGr) * (1 + annualGr) * (1 + annualGr) * (1 + annualGr);

	double fifthYear = forthYear * (1 + annualGr) * (1 + annualGr) * (1 + annualGr) * (1 + annualGr) * (1 + annualGr);

	System.out.printf("World population after one year is: %f%n", firstYear);
	
	System.out.printf("World population after two year is: %f%n", secondYear);

	System.out.printf("World population after three year is: %f%n", thirdYear);

	System.out.printf("World population after four year is: %f%n", forthYear);

	System.out.printf("World population after five year is: %f%n", fifthYear);
  }
}