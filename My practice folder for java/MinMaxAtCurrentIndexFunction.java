public class MinMaxAtCurrentIndexFunction{

	public static String atCurrentIndex(int[] numbers){
	int sum = 0;
	
	for(int count = 0; count < numbers.length; count++){

	sum += numbers[count];

	}
	//System.out.println(sum);
	

	int[] index = new int[numbers.length];

	for(int counter = 0; counter < index.length; counter++){

	index[counter] = sum - numbers[counter];
	
	//System.out.println(index[counter]);
	}
	
	int minimum = index[0];
	int maximum = index[0];

	for(int counting = 0; counting < index.length; counting++){
	
	if(index[counting] < minimum){
	minimum = index[counting];
	}
	if(index[counting] > maximum){
	maximum = index[counting];
	}
	}
	return minimum + ", " + maximum;
	}
}