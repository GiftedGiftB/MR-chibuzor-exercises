public class ArrayKata{

   public static int maximumIn(int[] number){
	int maximum = 0;
	
	for(int count = 0; count < number.length; count++){
	if (number[count] > maximum){
	maximum = number[count];
	}
	
	}
	return maximum;


	}

	public static int minimumIn(int[] number){
	int minimum = 0;
	
	for(int count = 0; count < number.length; count++){
	if (number[count] < minimum){
	minimum = number[count];

	}
	}




}






