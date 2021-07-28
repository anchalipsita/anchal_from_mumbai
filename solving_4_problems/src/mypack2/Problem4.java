
// Problem 4
// 4. Given a right angle triangle with sides a, b and c. As per Pythagoras theorem the hypotenuse side c can be calculated as square root of a square plus b square. Write a program to compute the hypotenuse, when a and b are provided


package mypack2;
import java.util.*;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double s = Math.pow(a, 2) + Math.pow(b, 2);
		double c = Math.pow(s, 0.5);
		
		System.out.println("Hypotenuse is: " +c);

	}

}
