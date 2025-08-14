import java.util.Arrays;
public class ArrayTransform{
	public static void main(String[] args){

	int[] arrays = {7, 8, 9, 10, 11};
	int[] result = transformTheArray(arrays);

	System.out.print(Arrays.toString(result));
}
	public static int[] transformTheArray(int[] numbers){
	int[] newNumber = new int[numbers.length];

	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] % 2 == 0){
			newNumber[count] = 1;
		}
		else{
			newNumber[count] = 0;
		}
	}
		return newNumber;
	}
}