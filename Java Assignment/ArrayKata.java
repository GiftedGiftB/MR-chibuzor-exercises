public class ArrayKata{

	// number 1

	public static int maximumIn(int[] number){
	int maximum = 0;
	
	for(int count = 0; count < number.length; count++){
	if (number[count] > maximum){
	maximum = number[count];
	}
	}
	return maximum;


} 
	// number 2

	/* public static int minimumIn(int[] number){
	int minimum = 54567893;
	
	for(int count = 0; count < number.length; count++){
	if (number[count] < minimum){
	minimum = number[count];
	}
	}
	return minimum;
	} */

	//number 3

	public static int sumOf(int[] integer){
	int sum = 0;
	for(int count = 0; count < integer.length; count++){
	sum += integer[count];
	}
	return sum;
	}
	
}


