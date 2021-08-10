//Task2 - If the word is of odd length then convert middle letter to uppercase else convert first letter to uppercase


package mypack;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(evenOddCase(str));

	}
	
	public static String evenOddCase(String str) {
		String s[] = str.split(" ");
		StringBuffer s1 = new StringBuffer();
		
		for(int i=0; i<s.length; i++) {
			int m = s[i].length();
			
			if(m%2 == 0) {
				s1.append(Character.toUpperCase(s[i].charAt(0))).append(s[i].substring(1)).append(" ");
			}
			else {
				s1.append(s[i].substring(0, m/2)).append(Character.toUpperCase(s[i].charAt(m/2))).append(s[i].substring((m/2)+1)).append(" ");
			}
		}
		
		return s1.toString().trim();
	}

}
