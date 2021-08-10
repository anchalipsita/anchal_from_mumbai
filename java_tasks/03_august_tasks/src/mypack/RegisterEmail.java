package mypack;

import java.util.Scanner;

public class RegisterEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		RegistrationService s1 = new RegistrationService();
		
		try {
			if(s1.validateEmailUncheckedException(str)) {
				System.out.println("Valid Email! Email accepted.");
			}
		}	
		catch (EmailNotValidException e){
			System.out.println(e.getMessage());
		}
				
	}

}
