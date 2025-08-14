public class SumOfEven32{
	public static void main(String[] args){
	
	int total = 0;

	for(int count = 1; count <= 20; count++){
		if(count % 2 == 0){
		total += count;
		}
	}
	System.out.println(total);
	
}
}