//5)Take array as input remove the digits where the first value and last value is same
//  eg [101,22,344,699]-> in this 101 and 22 should be removed because the first digit and last is same
//  so output will be [344,699]


package mypack2;

import java.util.*;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();;
		}
		
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i]+"";
			StringBuilder sb = new StringBuilder(s);
			if(sb.substring(0,1).equals(sb.reverse().substring(0,1))) {
				continue;
			}
			
			else {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
