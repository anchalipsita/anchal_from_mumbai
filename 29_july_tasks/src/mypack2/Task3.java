//3)Find all the palindrome numbers in array


package mypack2;
import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			}
		
		for(int i=0; i<n; i++) {
			if(isPalindrome(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static boolean isPalindrome(int m) {
		String k = m+"";
		return new StringBuilder(k).reverse().toString().equals(k);
	}

}
