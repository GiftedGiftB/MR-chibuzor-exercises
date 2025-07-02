import java.util.Scanner;

public class ForLoopPractice {
	// 1
	public static void oneToTen() {
        for(int count = 1; count <= 10; count++)
		System.out.printf(count + " ");
	System.out.println();

    }
	// 2
	public static void evenNumber(int number){

	for(int count = 2; count <= number; count += 2)					System.out.print(count + " ");	

        }
	// 3
	public static void oddNumber(int numbers){
	for(int count = 1; count <= numbers; count += 2){
		System.out.print(count + " ");
	}
	}



	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        // 1
	oneToTen();
	System.out.println();

	// 2
	System.out.print("Enter a number: ");
	int userNumber = input.nextInt();
	evenNumber("The even number is: " + userNumber);
	System.out.println();
	
	// 3
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	oddNumber("The odd number is: " + number);

	}
}
