import java.util.Arrays;

public class FireDrillThree{
public static void main(String[] args){


	taskOne();
	System.out.print("");
	taskTwo();
	System.out.println("");
	taskThree();
	System.out.println("");

	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 100};
	int[] result = taskFour(score);
	System.out.println(Arrays.toString(result));



}

	public static void taskOne(){
	int[] score = {10, 20, 30, 40 , 50, 60, 70, 80, 90, 100};

	}
	public static void taskTwo() {
		int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int count = 0; count < score.length; count++) {
		}

	}
	public static void taskThree() {
	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 100};
	for (int count = 0; count < score.length; count++) {
	}

	}
	public static int[] taskFour(int arrays){
		for (int count = 2; count < arrays.length; count += 2) {
			int newArrays[count];
		}
		return newArrays;
	}

	public static int[] taskFive(int[] arrays){
	for (int count = 1; count < arrays.length; count += 3) {
		int newArrays[count];
	}
	return newArrays;
	}

}