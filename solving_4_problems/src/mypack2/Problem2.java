
// Problem 2
// 2. Given a website address as a string, find out if the website is secure or not. A website address starting with "http" // is not secure and a website with "https" is secure.


package mypack2;
import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(str.startsWith("https")) {
			System.out.println("secure");
		}
		
		else if(str.startsWith("http")) {
			System.out.println("not secure");
		}
		
		else System.out.println("Invalid website");
		

	}

}
