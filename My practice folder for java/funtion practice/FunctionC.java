public class FunctionC{
	// number1
public static int sumOfEvenNumber(int[] numbers){
int sum = 0;
for(int count = 0; count < numbers.length; count++){
	if(count % 2 == 0){
		sum += numbers[count];
	}
	}
	return sum;

}

public static int multiplicationTable(int number){

	for(int count = 1; count <= 12; count++){
	System.out.println(number + " * " + count + " = " + (number * count));
	}
	return number;
}


public static void main(String[] args){

int[] num = {10,20,30,40,50};
int result = sumOfEvenNumber(num);
System.out.println(result);
 
System.out.println("Multiplication of 2");
multiplicationTable(2);

System.out.println("Multiplication Table of 5");

	for(int count=1; count <= 12; count++){

	System.out.println("5 * " + count + " = " + (5 * count) + "  	" + "3 * " + count + " = " + (3 * count));

	}

}
}

