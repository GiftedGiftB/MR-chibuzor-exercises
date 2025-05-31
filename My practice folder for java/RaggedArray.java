public class RaggedArray{
	public static void main(String[] args){

	int[] numbers = {1,2,3,2,4,5};

	for(int i = 0; i < numbers.length; i++)
		for(int j = 0; j < numbers.length; j++)
			System.out.print(Array.toString(numbers));
	
		System.out.println();

  }
}
