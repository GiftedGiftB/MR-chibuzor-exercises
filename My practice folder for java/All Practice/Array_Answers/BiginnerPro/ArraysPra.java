import java.util.Arrays;
public class ArraysPra{
public static void main(String[] args){

	int[] number = {12, 21, 30, 10, 50};
	number = addNewElement(number);
	System.out.print(Arrays.toString(number));

}

	public static int[] addNewElement(int[]array){
	
		for(int count = 0; count <= array.length; count++){
			if(count == array.length -1){
			array[count] = 3;
			}
		}
		return array;
	}

}