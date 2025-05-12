import java.util.Scanner;
public class SecondHighestScore{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int counter = 0;
	String studentName = " ";
	int studentScore = 0;
	int highestScore = 0;
	int secondHighestScore = 0;
	String secondHighestName = " ";	

	System.out.print("Enter number of student: ");
	int NumberOfStudent = scan.nextInt();

	while(counter != NumberOfStudent) {

	System.out.print("Enter student name: ");
	studentName = scan.nextInt();

	System.out.print("Enter student score: ");
	studentScore = scan.nextInt();
	
	
	if (studentScore > highestScore){
	
	highestScore = studentName;
	HighestName = " ";
	secondHighestScore = highestScore;
	secondHighestName = studentName
	
	}
	counter++;
	}
	System.out.print("The student with the highest score is : "+ highestScore + secondHighestScore);
	
	System.out.print("Second highest score is : "+ secondHighestName + secondHighestScore);

  }   
}