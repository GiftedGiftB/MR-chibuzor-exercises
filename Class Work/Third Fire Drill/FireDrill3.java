public class FireDrill3{
public static void main(String[] args){
	taskOne();
	taskTwo();
	taskThree();
	System.out.println(" ");
	taskFour();
	System.out.println(" ");
	taskFive();
	System.out.println(" ");

	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	int result = taskSix(score);
	System.out.print("Sum is: " + result);
	
	System.out.print(" ");
	int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	int sum = taskSeven(array);
	System.out.print("Sum is: " + sum);


	

}

public static void taskOne(){
	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int count = 0; count < score.length; count++){

		}
}

public static void taskTwo(){
	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int count = 0; count < score.length; count++){
			System.out.println(score[count]);

}


		}

public static void taskThree(){
	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int count = 0; count < score.length; count++){
			System.out.print(score[count] + " ");

		}
}
public static void taskFour(){
	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int count = 1; count < score.length; count += 2){
			System.out.println(score[count]);

		}

}
public static void taskFive(){
	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int count = 3; count < score.length; count += 3){
			System.out.println(score[count]);

		}

}
public static int taskSix(int[] score){
int sum = 0;
	for (int count = 0; count < score.length; count++){
		sum += score[count];
		}
			return sum;

}
public static int taskSeven(int[] array){
int sum = 0;
	for (int count = 3; count < array.length; count += 3){
		sum += array[count];
		}
		return sum;

}

}