//2)Take an array and remove all duplicates in it


package mypack2;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		a[0] = arr[0];
		
		int j = 1;
		
		for (int i = 1; i < n; i++) {
			if(arr[i-1]==arr[i]) {
				continue;
			}
			else {
				a[j++] = arr[i];
			}
		}
		
		
		for (int i = 0; i < j; i++) {
			System.out.print(a[i]+" ");
		}

	}
	

}
