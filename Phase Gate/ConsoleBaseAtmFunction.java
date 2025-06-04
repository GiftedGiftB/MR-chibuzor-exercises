public class ConsoleBaseAtmFunction{


	public static 

	def account_balance():
	print(f"your balance is ${balance:.2f}")

def withdraw():
	amount = float(input("Enter withdrawal amount: "))
	if amount < 0:
		print("invalid withdraw amount")
	else:
		return amount

def maximum_amount():
	if withdraw_amount > 20000:
		print("20,000 per transaction")



fixed_charges = 100

balance = 50000 - fixed_charges

is_running = True

while is_running:
	print("""
1. Account balance
2. Withdraw
3. Exit
""")
	userNumber = int(input("Enter a number from 1 - 3: "))
	match userNumber:
		case 1:
			account_balance()
		case 2: 
			balance -= withdraw()
		case 3: 
			maximum_amount()
		case 4:
			is_running = False
		case _:
			print("invalid.")
print("Thanks for using our services")




}