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

	public static int addNumber(int number, int digit){
		int sum = number + digit;
			return sum;
	}

}
