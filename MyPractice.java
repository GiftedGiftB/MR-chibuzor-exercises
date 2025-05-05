import java.util.Scanner;
public class MyPractice{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int passes = 0;
	int failures = 0;
	int studentCounter = 1;

	while(studentCounter <= 10){

	System.out.print("Enter exam result (1 = pass, 2 = fail): ");
	int result = scan.nextInt();

	if(result == 1) {
	passes = passes + 1;
	}
	else{
	failures = failures + 1;
	}
	studentCounter = studentCounter + 1;
	}
	System.out.printf("passed: %d%nfailed: %d%n", passes, failures);
	
	if(passes > 8) {
	System.out.println("Bonus to instructor!");
	}

  }

}