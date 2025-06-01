import java.util.Arrays;

import java.util.Scanner;
public class HowToCollectInputWithArray{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter array size: ");
	int userNumber = input.nextInt();

	int[] array = new int[userNumber];

	System.out.print("Enter number: ");
	for(int i = 0; i < userNumber; i++){
	array[i] = input.nextInt();
	}
	System.out.println(Arrays.toString(array));
	
	int sum = 0;

	for(int i = 0; i < array.length; i++){
	
	sum += array[i];
	}
	System.out.print("The sum is: " + sum);





}
}