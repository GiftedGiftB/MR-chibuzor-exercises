// Main program loop
BEGIN
  DISPLAY "Welcome to the Banking App!"
  WHILE true DO // Loop until user exits
    DISPLAY "Select an option:"
    DISPLAY "1. Create Account"
    DISPLAY "2. Deposit Funds"
    DISPLAY "3. Withdraw Funds"
    DISPLAY "4. Check Balance"
    DISPLAY "5. Exit"

    INPUT choice

    SWITCH choice
      CASE 1:  // Create Account
        INPUT username
        INPUT password  //Consider secure password handling in real implementation
        IF create_account(username, password) THEN
          DISPLAY "Account created successfully!"
        ELSE
          DISPLAY "Account creation failed. Username may already exist."
        ENDIF
      CASE 2:  // Deposit Funds
        INPUT account_number
        INPUT amount
        IF deposit(account_number, amount) THEN
          DISPLAY "Deposit successful!"
        ELSE
          DISPLAY "Deposit failed. Invalid account number or insufficient funds."
        ENDIF
      CASE 3:  // Withdraw Funds
        INPUT account_number
        INPUT amount
        IF withdraw(account_number, amount) THEN
          DISPLAY "Withdrawal successful!"
        ELSE
          DISPLAY "Withdrawal failed. Invalid account number or insufficient funds."
        ENDIF
      CASE 4:  //Check Balance
        INPUT account_number
        balance = check_balance(account_number)
        IF balance != -1 THEN // -1 indicates failure.
          DISPLAY "Your balance is: " + balance
        ELSE
          DISPLAY "Invalid account number."
        ENDIF
      CASE 5:  // Exit
        BREAK //Exit the loop
      DEFAULT:
        DISPLAY "Invalid choice. Please try again."
    ENDSWITCH
  ENDWHILE
  DISPLAY "Thank you for using the Banking App!"
END


// Function to create a new account (replace with actual database interaction)
FUNCTION create_account(username, password)
  // Check if username already exists (database query)
  // If not exists, insert new user into database
  // Return true for success, false for failure
ENDFUNCTION


// Function to deposit funds (replace with actual database interaction)
FUNCTION deposit(account_number, amount)
  // Check if account exists
  // Update account balance in database
  // Return true for success, false for failure
ENDFUNCTION


// Function to withdraw funds (replace with actual database interaction)
FUNCTION withdraw(account_number, amount)
  // Check if account exists and has sufficient balance
  // Update account balance in database
  // Return true for success, false for failure
ENDFUNCTION

// Function to check balance
FUNCTION check_balance(account_number)
  //Check account number validity
  //Return balance if account exists and -1 otherwise
ENDFUNCTION