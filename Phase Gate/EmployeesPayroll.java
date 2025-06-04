import java.util.Scanner; 
public class EmployeesPayroll{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	System.out.print("""

	Welcome to semicolon Employees payroll

1. Add Employees payroll
2. View Employees payroll
3. Update Employees payroll
4. Exit

	""");

	int deduction = 0;
	int counter = 0;
	int fedralCharges = 0;
	int grossPay = 0;
	int fedralWitholding = 0; 

	System.out.print("Enter numbers of Employees: ");
	int response = input.nextInt();

	while(counter != response){

		System.out.print("Enter Employee's name: ");
		String names = input.next();

		System.out.print("Enter number of hours worked: ");
		int hours_worked = input.nextInt();

		System.out.print("Enter Hourly pay rate: ");
		int pay_rate = input.nextInt();

		System.out.print("Enter fedral tax withholding rate: ");
		int fedral_tax = input.nextInt();

		System.out.print("Enter state tax withholding rate: ");
		int state_tax = input.nextInt();

		grossPay = hours_worked * pay_rate;

		fedralWitholding = fedralCharges * grossPay;
}
		System.out.println(grossPay);
		System.out.println(fedralWitholding);


 }
}