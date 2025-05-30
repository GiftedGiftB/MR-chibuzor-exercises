public class SmallestAndLargestIndex{
	public static void main(String[] args){
	


		int[] numbers = {1,5,3,4,5,5};

		int largestNumber = 0;
		int indexNumber = 0;
		for(int count = 0; count < numbers.length; count++)
				
		if (largestNumber < numbers[count])
		

		indexNumber = indexNumber + numbers[count];
	
		System.out.print(indexNumber);

}
}