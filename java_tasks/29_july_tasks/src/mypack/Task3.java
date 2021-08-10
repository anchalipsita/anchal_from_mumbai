//Task3 - In every word if it is not palindrome then reverse it and print back the whole sentence.


package mypack;
import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(reverseIfNotPalindrome(str));

	}
	
	public static boolean isPalindrome(String str) {

		return new StringBuilder(str).reverse().toString().equals(str);
	}
	
	public static String reverseIfNotPalindrome(String str) {
		String s[] = str.split(" ");
		StringBuilder s1 = new StringBuilder();
		
		for(int i=0; i<s.length; i++) {
			if(isPalindrome(s[i])) {
				s1.append(s[i]).append(" ");
			}
			else {
				StringBuilder sb = new StringBuilder(s[i]);
				sb.reverse();
				s1.append(sb).append(" ");
			}
		}
		
		return s1.toString().trim();
	}

}
