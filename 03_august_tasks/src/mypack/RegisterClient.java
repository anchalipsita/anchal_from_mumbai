package mypack;
import java.util.*;

public class RegisterClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		RegistrationService s1 = new RegistrationService();
		
		try {
			if(s1.validatePasswordCheckedException(str)) {
				System.out.println("Valid Password");
			}
		}	
		catch (PasswordNotValidException e){
			System.out.println(e.getMessage());
		}
		

	}

}
