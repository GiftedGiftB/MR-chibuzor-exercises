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
	System.out.println();
        }
	// 3
	public static void oddNumber(int numbers){
	for(int count = 1; count <= numbers; count += 2){
		System.out.print(count + " ");
	System.out.println();
	}
	}

	// 4
	public static void multiplesOf4(int numbers){
	for(int count = 4; count <= numbers; count += 4){
		System.out.print(count + " ");
	System.out.println();

	}
	} 

	// 5
	public static void multiplesOf4In5Places(int number){
	for(int count = 4; count <= number; count += 4){
		for(int counter = 1; counter <= 5; counter++){
			System.out.print(count + " ");
	}
	}
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        // 1
	oneToTen();
	
	// 2
	System.out.print("Enter a number: ");
	int userNumber = input.nextInt();
	evenNumber(userNumber);
	System.out.println();
	
	// 3
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	oddNumber(number);
	System.out.println();

	// 4
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	multiplesOf4(num);
	

	// 5
	System.out.print("Enter a number: ");
	int num1 = input.nextInt();
	multiplesOf4In5Places(num1);
	


	}
}
