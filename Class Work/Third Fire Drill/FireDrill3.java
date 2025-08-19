public class FireDrill3{
public static void main(String[] args){
	taskOne();
	taskTwo();
	taskThree();
	System.out.println(" ");
	taskFour();

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


}