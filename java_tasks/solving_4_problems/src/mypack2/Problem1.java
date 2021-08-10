
// Problem 1
// 1. Given a website address as a string, extract the domain name. For example, if the website address is // "https://en.wikipedia.org/wiki/Main_Page", then it should return "en.wikipedia.org" as the domain name.


package mypack2;
import java.util.*;
import java.lang.String;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str[] = s.split("/");

		System.out.println(str[2]);
	}

}
