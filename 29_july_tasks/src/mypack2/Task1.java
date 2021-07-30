//1)Find Nth  max in array, remember it will have duplicates


package mypack2;
import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		Arrays.sort(arr);
		int temp = 0;
		
		for (int i = n-1; i >= 0; i--) {
			if(x == 1) {
				System.out.println(arr[i]);
				break;
			}
			if(arr[i] != arr[i-1]) {
				temp += 1;
				if(temp == x) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
