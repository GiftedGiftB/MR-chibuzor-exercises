import java.util.Arrays;
public class ConvertToZerosAndOnes{
	public static void main(String[] args){

	int[] arrayNumber = {10, 20, 30, 40, 50, 3};
	
	int[] result = ZerosAndOnes(arrayNumber);
	
	System.out.print(Arrays.toString(result));
	
}
	public static int[] ZerosAndOnes(int[] array){
	int[] newArray = new int[6];

	for(int count = 0; count < array.length; count++){
		if(array[count] % 2 == 0){
			newArray[count] = 1;
		}
		else{
			newArray[count] = 0;
	}
	}
	return newArray;
	}


}