public class FireDrill4{
	public static void main(String[] args){

	int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
	int minimum = taskEight(score);
	System.out.print("minimum is: " + minimum);
}

public static int taskEight(int[] score){
	int minimum = 2000;
		for (int count = 0; count < score.length; count += 2){
			if(score[count] < minimum){
				minimum = score[count];
			}

		}
		return minimum;
}



}