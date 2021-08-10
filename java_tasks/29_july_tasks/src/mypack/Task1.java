//Task1 - Convert every word's last letter to upper case


package mypack;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(lastLetterUpperCase(s));	
		

	}
	
	public static String lastLetterUpperCase(String s) {
		String str[] = s.split(" ");
		StringBuilder s1 = new StringBuilder();
		
		for(int i=0; i<str.length; i++) {
			int m = str[i].length();
			s1.append(str[i].substring(0, m-1)).append(Character.toUpperCase(str[i].charAt(m-1))).append(" ");
		}
		
		return s1.toString().trim();
		
	}

}
