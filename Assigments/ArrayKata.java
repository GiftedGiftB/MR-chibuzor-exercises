public class ArrayKata{

	// number 1

	/* public static int maximumIn(int[] number){
	int maximum = 0;
	
	for(int count = 0; count < number.length; count++){
	if (number[count] > maximum){
	maximum = number[count];
	}
	}
	return maximum;
} */


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

	/* public static int sumOf(int[] integer){
	int sum = 0;
	for(int count = 0; count < integer.length; count++){
	sum += integer[count];
	}
	return sum;
} */

	// number 4
	/* public static int sumOfEvenNumbersIn(int[] integers){

	  int counter = 0;

	for(int count = 0; count < integers.length; count++){
	if(integers[count ] % 2 == 0){

	counter += integers[count];
	}	
	}
	return counter;
} */


	// number 5
	public static int sumOfOddNumbersIn(int[] integer){
	int counter = 0;
	for(int count = 0; count < integer.length; count++){
	if(integer[count] % 2 != 0){
	counter += integer[count];
	}
	}
	return counter;

}

	
	// number 6

	/* public static int[]  maximumAndMinimumOf(int[] maxMin){
	int maximum = 0;
	int minimum = 467839874;

	for(int count = 0; count < maxMin.length; count++){

	if(count[maxMin.length] > maximum){
	maximum = count[maxMin.length];
	}
	if(count[maxMin.length] < minimum){
	minimum = count[maxMin.length];
	}
	return 
	} */

	// number 7

	public static int noOfOddNumbersIn(int[] number){
	int counter = 0;

	for(int count = 0; count < number.length; count++){
	if(number[count] % 2 != 0){
	counter = number[count];
	}
	}
	return counter;
	}
	

	
}


