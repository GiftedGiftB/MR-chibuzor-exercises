import java.util.Scanner;
public class NumberOfYear{
	public static void main(String[] args){
	Scanner giftScanner = new Scanner(System.in);

	System.out.print("Enter the minutes");
	long tM = giftScanner.nextLong();

	long hour = tM / 60;
	long day = hour / 24;
	long year = day / 365;

	long remDays = day % 365;
	long remHours = hour % 24;
  
	System.out.printf("1000000000 minutes is approximately :%d years :%d days %d hours", year, remDays, remHours);
}

}