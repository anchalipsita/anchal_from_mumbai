//4)Find all prime numbers in array


package mypack2;
import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();;
		}
		
		for(int i=0; i<n;i++) {
			prime(arr[i]);
		}

	}
	
	public static void prime(int m) {
		int x = 0;
		for(int i=2; i<m; i++) {
			if(m%i == 0) {
				x+=1;
				break;
			}
		}
		
		if(x==0 && m>1) {
			System.out.println(m);
		}
	}

}
