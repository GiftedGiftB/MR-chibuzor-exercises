public class TasksOnline{
	public static void main(String[] args){

		// number 1

	/* int price = 150;
	int discount = 10;

	int total = afterDiscount(price,discount);
	System.out.print("Discount is: " + (total));  */


		// number 2

	/* int billAmount = 80;
	int taxPercent = 10;
	int tipPercent = 15;

	int result = totalBillWithTaxAndTip(billAmount, taxPercent, tipPercent);
	System.out.println("Total bill amount: " + result); */

		// number 3

	/* float sellingPrice = 65f;
	float costPrice = 50f;
	float price = priceOfCostAndSelling(costPrice,sellingPrice);
	System.out.print("The profit is: " + price); */

		// number 4

	//greetUser("dan");

	// System.out.print(greetUser(" dan"));

		// number 5

	/* int number = 10;
	int digit = 5;
	int sum = addNumber(number,digit);

	System.out.print("The sum is: " + sum); */

		// number 6

	/* boolean result = isEven(10);
	System.out.print(result); */
	
		// number 7

	/* int num1 = 3;
	int num2 = 7;
	int num3 = 2;
	int result = findMax(num1, num2, num3);
	System.out.print(result); */

		// number 8
	String word = "banana";
	int counter = countVowels(word);
	System.out.println(counter);

	
}



		// number 1

	/* public static int afterDiscount(int price, int discount){
        int total = price - (price * discount / 100);
        return total; 
} */
		// number 2

	/* public static int totalBillWithTaxAndTip(int billAmount, int taxPercent, int tipPercent){
		int taxAmount = (billAmount * taxPercent / 100);
		int tipAmount = (billAmount * tipPercent / 100);
		int result = billAmount + taxAmount + tipAmount;
		return result;
    } */

		// number 3

	/* public static float priceOfCostAndSelling(float sellingPrice, float costPrice){
		float price = sellingPrice - costPrice;
			return price;

	} */
	
		// number 4 

	/* public static void greetUser(String name){
	//return "Hello" + name;
	System.out.println("Hello" + name);
	} */

		// number 5

	/* public static int addNumber(int number, int digit){
		int sum = number + digit;
			return sum;
	} */

		// number 6

	/* public static boolean isEven(int number){
		if(number % 2 == 0){
		return true;
		}
		return false; */
		
	}

		// number 7
		
	/* public static int findMax(int num1, int num2, int num3){
		int max = num1;

		if(num2 > max){
		max = num2;
		}
		if(num3 > max){
		max = num3;
		}
		return max;
	} */

		// number 8

	/* public static String countVowels(String vowels){
		int counter = 0;
		vowels = vowels.toLowerCase();

		for(int count = 0; count <= vowels; count++){
			char ch = vowels.charAt(count);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				counter++;
			}
		}
		return counter;

	} */

	

}
