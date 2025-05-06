public class NumbersOnArray{
	public static void main(String[] args){

	int[] number= {22,51,38,23,48};
	for (int count = 0; count < number.length; count++)
	System.out.println(number[count] + " ");
	
	
	for (int count = 0; count < number.length; count++)
	System.out.print(number[count] + " ");


	int[] numbers = {22,51,38,23,48};
	int total = 0;

	for (int count = 0; count < numbers.length; count++){
	total = total + numbers[count];

	}

	System.out.printf("The total is: %d%n", total);
 
}
}