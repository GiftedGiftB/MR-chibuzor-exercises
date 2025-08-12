public class InputAndOutput{

	public static int[] maximumAndMinimum1(int[] numbers){
	int maximumNumber[] = new int[1];
	int minimumNumber[] = new int[1];
	
	maximumNumber[0] = numbers[0];
	minimumNumber[0] = numbers[0];

	int range1[] = new int[1];

	for(int count = 0; count < numbers.length; count++){
	
	if(numbers[count] > maximumNumber[0]){
	maximumNumber[0] = numbers[count];
	}
	if(numbers[count] < minimumNumber[0]){
	minimumNumber[0] = numbers[count];
	}
	}
	range1[0] = maximumNumber[0] - minimumNumber[0];
		return range1;
	}
		


	public static int[] maximumAndMinimum2(int[] grades){

	int minimumNumber[] = new int[1];
	int maximumNumber[] = new int[1];
	
	int range2[] = new int[1];

	maximumNumber[0] = grades[0];
	minimumNumber[0] = grades[0];

	for(int counter = 0; counter < grades.length; counter++){
	
	if(grades[counter] > maximumNumber[0]){
	 maximumNumber[0] = grades[counter];
	}
	if(grades[counter] < minimumNumber[0]){
	minimumNumber[0] = grades[counter];
	}
	}
	range2[0] = maximumNumber[0] - minimumNumber[0];
		return range2;
	}

}
