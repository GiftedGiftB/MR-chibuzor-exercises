public class SumOfEven32Function{
	public static void main(String[] args){
	

	int total = sum();
	System.out.println(total);

}

	public static int sum(){
	int total = 0;

	for(int counter = 1; counter <= 20; counter++){
		if(counter % 2 == 0){
		total += counter;
		}
	}
	return total;
	}

}