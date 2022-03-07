package assignment;

//WAP to validate an email with given conditions.
	// C1 - Only 1 occurrence of @ and .
	// C2 - Minimum 4 characters before @.
	// C3 - Minimum 3 characters between @ and .
	// C4 - Minimum 2 characters after .package assignment;

import java.lang.String;
public class EmailValidator {
		public static void main(String[] args) {
		String email = "abcde@gmail.com";
		int at = email.indexOf('@');
		int dot = email.indexOf('.');
		if(at == email.indexOf('@') && dot == email.indexOf('.') && at > 3 && dot > (at +3) && email.length() > (dot + 2))
			{System.out.println("Valid email.");
			}
		else
			{ System.out.println("Invalid email.");
			}		
	}

}
