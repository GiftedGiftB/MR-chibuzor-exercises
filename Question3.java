import java.util.Scanner;
public class Question3{
	public static void main(String[] args){
	Scanner inputScanner = new Scanner(System.in);

	
	System.out.print("Enter first number: ");
	int number1 = inputScanner.nextInt();
	
	System.out.print("Enter second number: ");
	int number2 = inputScanner.nextInt();

	System.out.print("Enter third number: ");
	int number3 = inputScanner.nextInt();

	System.out.print("Enter forth number: ");
	int number4 = inputScanner.nextInt();

	System.out.print("Enter fifth number: ");
	int number5 = inputScanner.nextInt();

	if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5){
	System.out.printf("First number is the largest %d%n", number1);
	} 
	else if(number2 > number3 && number2 > number4 && number2 > number5 && number2 > number1){
	System.out.printf("Second number is the largest %d%n", number2);
	}
	else if(number3 > number4 && number3 > number5 && number3 > number1 && number3 > number2){
	System.out.printf("Third number is the largest %d%n", number3);
	}
	else if(number4 > number5 && number4 > number1 && number4 > number2 && number4 > number3){
	System.out.printf("Forth number is the largest %d%n", number4);
	}
	else if(number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4){
	System.out.printf("Fifth number is the largest %d%n", number5);
	} 
	if(number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5){
	System.out.printf("First number is the smallest %d%n", number1);
	} 
	else if(number2 < number3 && number2 < number4 && number2 < number5 && number2 < number1){
	System.out.printf("Second number is the smallest %d%n", number2);
	}
	else if(number3 < number4 && number3 < number5 && number3 < number1 && number3 < number2){
	System.out.printf("Third number is the smallest %d%n", number3);
	}
	else if(number4 < number5 && number4 < number1 && number4 < number2 && number4 < number3){
	System.out.printf("Forth number is the smallest %d%n", number4);
	}
	else if(number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4){
	System.out.printf("Fifth number is the smallest %d%n", number5);
	}
	
	int sum = number1 + number2 + number3 + number4 + number5;
	int average = sum / 5;
	System.out.printf("The average number is: %d%n", average);

	//int average = 

	
  }
}