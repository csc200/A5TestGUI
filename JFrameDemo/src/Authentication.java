import javax.swing.JOptionPane;

public class Authentication {
	public static void validate(String username, String password) {
		// Initialize variables
		String uname = "Michael";
		String pass = "csc200";
		String inputPass = password;
		String inputName = username;
		int attempt = 0;
		String accountMichael = "Admin";
		String accountType;
		// LOOP - do this while attempt <=2
		//System.out.println(inputPass);
		//System.out.println(inputPass);
		
		do {
			// INPUT/OUTPUT - Dialog box PROMPT user for user name
			//inputName = JOptionPane.showInputDialog("Enter username");
			// CONDITION - IF the inputName is the same as uname
			if (uname.equals(inputName)) {
				// LOOP - do this while attempt<=2
				do {
					// INPUT/OUTPUT - Dialog box PROMPT user for password
					//inputPass = JOptionPane.showInputDialog("Please enter password");
					// CONDITION - IF inputPass is the same as pass
					if (inputPass.equals(pass)) {
						// QUIT the loop
						break;
					}
					// CONDITION - ELSE
					else
						// OUTPUT - Dialog box PROMPT it is the wrong password
						JOptionPane.showMessageDialog(null, "Wrong password");
					// INCREMENT attempt by 1
					attempt++;
				} while (attempt <= 2);
				if (uname.equals(inputName))
					break;
			}
			// CONDITION - ELSE
			else
				// OUTPUT - Dialog box PROMPT it is the wrong user name
				JOptionPane.showMessageDialog(null, "Invalid Username");
			// INCREMENT attempt by 1
			attempt++;
		} while (attempt <= 2);
		// CONDITION - IF the inputName is the same as uname OR inputPass is the
		// same as pass AND attempt = 2
		if (!inputPass.equals(pass) || !uname.equals(inputName) && attempt == 2) {
			// OUTPUT - Dialog box PROMPT user that account is locked
			JOptionPane.showMessageDialog(null,
					"Your account has been locked - Contact Administrator");
			// Exit program
			System.exit(attempt = 2);
		}
		// Create array of strings: choices
		String[] choices = { "Admin", "Student", "Staff" };
		// LOOP - do this while accountMichael != accountType
		do {
			// Cast accountType to String - Dialog box with drop down list -
			// PROMPT user for selection
			accountType = (String) JOptionPane.showInputDialog(null,
					"Choose account type...", "Account Type",
					JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
			// SWITCH CASE - based on accountType
			switch (accountMichael) {
			// CASE - accountType = Admin
			case "admin":
				break;
			// CASE - accountType = Student
			case "student":
				break;
			// CASE - accountType = Staff
			case "staff":
				break;
			}
		} while (!accountMichael.equalsIgnoreCase(accountType));
		JOptionPane.showMessageDialog(null, "Welcome " + accountType);
		// EXIT the program
		System.exit(attempt = 3);
	}
}