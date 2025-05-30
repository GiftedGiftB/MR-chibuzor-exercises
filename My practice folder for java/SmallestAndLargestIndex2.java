public class SmallestAndLargestIndex{
	public static void main(String[] args){
	


		int[] numbers = {1,5,3,4,5,5};

		int largestNumber = numbers[0];
		int indexNumber = 0;
		for(int count = 0; count < numbers.length; count++)
				
		if (numbers[count] > largestNumber)

			largestNumber = numbers[count];
		
			indexNumber = count;
		
	
		System.out.print(indexNumber);

}
}