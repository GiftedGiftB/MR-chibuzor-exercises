import java.util.Arrays;
public class MinMax{
	public static void main(String[] args){

	int[] numbers = {8,0,1,4,9,2};
	
	int sum = 0;
	int maximum = 0;
	int minimum = 100;

	for(int count = 0; count < numbers.length; count++){
	sum += numbers[count];
	if(numbers[count] > maximum){
	maximum = numbers[count];
}
	if(numbers[count] < minimum){
	minimum = numbers[count];
}
		
	}

	System.out.println(sum);
	System.out.println(maximum);
	System.out.print(minimum);
	



	
	

  }

}



