public class SumAllDigits{
	public static void main(String[] args){

	// print 0 to 10

	//for(int count = 0; count <= 10; count++){
	//	System.out.print(count);
	//}

	// print out just the last number

	//int sum = 0;
	//for(int count = 0; count <= 10; count++){
	//	sum++;
	//}
	//System.out.print(sum);

	//sum all digit in a number 
	int sum = 0;
	for(int count = 0; count <= 10; count++){
		sum = sum + count;
	}
	System.out.print(sum);

 
}
}