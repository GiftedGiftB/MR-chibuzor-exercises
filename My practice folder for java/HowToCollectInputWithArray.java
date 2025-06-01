import java.util.Arrays;

import java.util.Scanner;
public class HowToCollectInputWithArray{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter array size: ");
	int userNumber = input.nextInt();

	int[] array = new int[userNumber];

	System.out.println("Enter numbers in array: ");
	for(int i = 0; i < userNumber; i++){
	array[i] = input.nextInt();
	}

	
	System.out.println(Arrays.toString(array));
}
}