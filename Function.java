public class Function{

 // number 1

public static int findMultiple(int number){
	return (number * 5);

}

// number 6

public static int computeSumOfNumber(int number){

int number1 = (number / 1000) % 10;
int number2 = (number / 100) % 10;
int number3 = (number / 10) % 10;
int number4 = (number / 1) % 10;

int result = number1 + number2 + number3 + number4;
	return result;
}

// number 7

public static boolean isLeapYear(int year){
	if (year % 4 == 0){
	return true;
}
	return false;
}

}

