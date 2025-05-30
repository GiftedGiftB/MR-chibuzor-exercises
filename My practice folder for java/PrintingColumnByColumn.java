public class PrintingColumnByColumn{
public static void main(String[] args){
		
int[][] numbers = {{3,5,7},{10,2,9}};

for(int i = 0; i <3; i++)
	for(int j = 0; j < 2; j++)
		System.out.print(numbers[j][i] + " ");
	System.out.println();

}
}