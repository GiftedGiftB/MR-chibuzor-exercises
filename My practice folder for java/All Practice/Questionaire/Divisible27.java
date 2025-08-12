import java.util.Scanner;
public class Divisible27{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	for(int count = 1; count <= 20; count++){
		if(count % 3 == 0 && count % 5 == 0){
			System.out.print(count);
		}	

	}
}

}