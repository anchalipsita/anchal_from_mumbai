package mypack;

public class RegistrationService {
	public boolean validatePasswordCheckedException(String password) throws PasswordNotValidException{

		if(password.length() >= 8 && password.length() <=20) {
			if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@!$#]{1,}.*") && password.matches(".*[A-Z]{1,}.*") && password.matches(".*[a-z]{1,}.*")) {
				return true;
			}
			else {
				throw new PasswordNotValidException("Please give a strong password.");
			}
		}	
		else {
			throw new PasswordNotValidException("Please give a password of length between 8 to 20.");
		}
		
	}
	
	
	public boolean validateEmailUncheckedException(String email) {
		
		if(email.endsWith("@gmail.com")  || email.endsWith("@yahoo.com") || email.endsWith("@rediffmail.com") || email.endsWith("@outlook.com")) {
			return true;
		}
		else {
			throw new EmailNotValidException("Invalid Email! Please enter a valid email.");
		}
	}
}
