package mypack;
import java.util.*;

public class GenerateBill {
	
	static double total = 0;
	
	public static void main(String[] args) {
		List <Bill> billList = new ArrayList<>();
		billList.add(new Bill("Sandwich",25,4));
		billList.add(new Bill("Coffee",150,10));
		billList.add(new Bill("Noodles",90,6));
		billList.add(new Bill("Biryani",375,2));
		billList.add(new Bill("Pizza",600,3));
		billList.add(new Bill("Ice-cream",75,8));
		
		System.out.println("----------------------------------------------------");
		System.out.println("item          price        quantity      linetotal");
		System.out.println("----------------------------------------------------");
		
		Collections.sort(billList, (Bill b1, Bill b2) -> {
			String s1 = b1.getItem();
			String s2 = b2.getItem();
			return s1.compareTo(s2);
		});
		
		for(Bill details:billList) {
			details.printDetails();
		}
		
		System.out.println("----------------------------------------------------");
		
		for(Bill list:billList) {
			double d1 = list.getPrice();
			double d2 = list.getQuantity();
			total += d1*d2;
		}
		
		System.out.println("Total\t\t\t\t\t  "+total);
		
		double finalBill = total + ((5*total)/100);
		
		System.out.println("\nGST : 5%");
		System.out.println("Total Bill including 5% tax : "+finalBill);
	}
		
	
}
