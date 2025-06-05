import java.util.Arrays;
import java.util.Scanner;
public class QuestionsLikeQuestionnaire{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.print("""

		Semicolon Questionnaire Game

""");
	
	int chooseFromOne = 0;
	int question1 = 1;
	int question2 = 2;
	int question3 = 3;
	int question4 = 4;
	int question5 = 5;
	int question6 = 6;
	int question7 = 7;
	int question8 = 8;
	int question9 = 9;
	int question10 = 10;



	int number1 = chooseFromOne;
	int number2 = question1;
	int number3 = question2;
	int number4 = question4;
	int number5 = question5;
	int number6 = question6;
	int number7 = question7;
	int number8 = question8;
	int number9 = question9;
	int number10 = question10;
	
	System.out.print("Enter number of questions you will like to answer: ");
	int trial = input.nextInt();

while(true){	

	System.out.print("Choose a number from 1 - 10: ");
	int userChoice = input.nextInt();
	
	if(userChoice > 10 && userChoice < 1){
	System.out.print("invalid");
}

	int[] quetionHolder = {chooseFromOne,question1,question2,question3,question4,question5,question6,question7,question8,question9,question10};
	
	
	
	if(userChoice == quetionHolder[1]){
	quetionHolder[1] = userChoice;
	System.out.print("""
		Question 1
	* Is water good for the body?
1. yes
2. i think so
3. maybe
4. no

""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 1){
		System.out.print("You are correct");
		} else if(answer != 1){

		System.out.print("You are wrong");
		}

	} if(userChoice == quetionHolder[2]){
	System.out.print("""
		Question 2
	* What is 2 * 2 ?
1. 1
2. 10
3. 4
4. 2
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 3){
		System.out.print("You are correct");
		} else if(answer != 3){

		System.out.print("You are wrong");
		}


	} if(userChoice == quetionHolder[3]){
	System.out.print("""
		Question 3
	* What is 2 * 3 ?
1. 1
2. 10
3. 4
4. 6
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 4){
		System.out.print("You are correct");
		} else if(answer != 4){

		System.out.print("You are wrong");
		}


	} if(userChoice == quetionHolder[4]){
	System.out.print("""
		Question 4
	* What is 3 * 2 ?
1. 1
2. 6
3. 4
4. 2
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 2){
		System.out.print("You are correct");
		} else if(answer != 2){

		System.out.print("You are wrong");
		}


	} if(userChoice == quetionHolder[5]){
	System.out.print("""
		Question 5
	* What is 4 * 2 ?
1. 1
2. 10
3. 8
4. 2
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 3){
		System.out.print("You are correct");
		} else if(answer != 3){

		System.out.print("You are wrong");
		}


	} if(userChoice == quetionHolder[6]){
	System.out.print("""
		Question 6
	* What is 7 * 1 ?
1. 7
2. 10
3. 4
4. 2
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 1){
		System.out.print("You are correct");
		} else if(answer != 1){

		System.out.print("You are wrong");
		}


	} if(userChoice == quetionHolder[7]){
	System.out.print("""
		Question 7
	* What is 10 * 2 ?
1. 20
2. 10
3. 4
4. 2
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 1){
		System.out.print("You are correct");
		} else if(answer != 1){

		System.out.print("You are wrong");
		}
	

	} if(userChoice == quetionHolder[8]){
	System.out.print("""
		Question 8
	* What is 5 * 4 ?
1. 1
2. 20
3. 4
4. 2
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 2){
		System.out.print("You are correct");
		} else if(answer != 2){

		System.out.print("You are wrong");
		}


	} if(userChoice == quetionHolder[9]){
	System.out.print("""
		Question 9
	* What is 8 * 1 ?
1. 1
2. 10
3. 8
4. 2
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 8){
		System.out.println("You are correct");
		} else if(answer != 8){

		System.out.println("You are wrong");
		}


	} if(userChoice == quetionHolder[10]){
	System.out.print("""
		Question 10
	* What is 3 * 2 ?
1. 1
2. 10
3. 6
4. 2
	
""");
	System.out.print("choose answer from 1 - 4: ");
	int answer = input.nextInt();

		if(answer == 3){
		System.out.println("You are correct");
		} else if(answer != 3){

		System.out.println("You are wrong");
		}

} 

}


  }
}

//for(int roll = 0; roll < quetionHolder.length; roll++){}