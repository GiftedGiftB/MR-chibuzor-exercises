import java.util.Scanner;
public class Pizza{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
int running = 3;
while(running != -1){

System.out.print("""
		Pizza Wahala 

	1. Chicken pizza
	2. Fish pizza
	3. Gizzard pizza
	4. Egg pizza
	-1 to exit
""");
	 String menu = input.next();
	switch(menu){
	case "1":
	System.out.print("""
	
		Drinks Menu

	1. Coke
	2. Fanta
	3. Pepsi
	0. Back to menu
	-1. Exit
""");
	String drinks = input.next();
		
	switch(drinks){
	case "1":
	System.out.print("""

		Food

	1. Jollfrice
	2. Yam & egg
	
""");
	case "2":
		System.out.println("Your order is ready");
	case "0":
	main(args);
	case "-1":
		System.exit(0);
	

	String food = input.next();
	switch(food){
	case "1":
	System.out.print("You selected: " + menu + drinks + " and "+ food);

	System.out.print("press ---- to go back to menu OR ---- to exit");
	case "-1":
		System.exit(0);
	default :
		System.out.println("Invalid input ... Try again");
		menu = input.next(); 		
	
	
}

break;

}
}
running = -1;
break;
}


}
}





