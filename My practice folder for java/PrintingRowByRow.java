public class PrintingRowByRow{
public static void main(String[] args){
		
int[][] numbers = {{3,5,7}, {10,2,9}};
 
for(int i = 0; i < 2; i++)
	for(int j = 0; j < 3; j++)
		System.out.print(numbers[i] [j] + " ");

	System.out.println();

}

}