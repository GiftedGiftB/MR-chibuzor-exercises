import java.util.Scanner;
    public class TaskFive{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

	int counter = 0;

	System.out.print("Enter number of scores: ");
	int userInput = input.nextInt();

	for(int count = 0; count <= userInput; count++){
		for(counter = 0; counter <= 10; counter++){

		System.out.print(count);
	}
	}

}
}