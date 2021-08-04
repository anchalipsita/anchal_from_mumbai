package mypack2;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Set;
//import java.util.LinkedHashSet;
//import java.util.Iterator;
import java.util.*;

public class UniqueProduct {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(101, "Sony Headphones", 1100.22, 3.8f, 10));
		productList.add(new Product(216, "Aquaguard Filter", 10000.22, 4.1f, 5));
		productList.add(new Product(101, "Sony Headphones", 1100.22, 3.8f, 10));
		productList.add(new Product(216, "Aquaguard Filter", 10000.22, 4.1f, 5));
		productList.add(new Product(109, "Panasonic TV", 13500.22, 3.3f, 7));
		productList.add(new Product(216, "Aquaguard Filter", 10000.22, 4.1f, 5));
		productList.add(new Product(176, "Dell Laptop", 90000.22, 4.3f, 8));
		productList.add(new Product(109, "Panasonic TV", 13500.22, 3.3f, 7));
		productList.add(new Product(101, "Sony Headphones", 1100.22, 3.8f, 10));
		productList.add(new Product(176, "Dell Laptop", 90000.22, 4.3f, 8));
		productList.add(new Product(216, "Aquaguard Filter", 10000.22, 4.1f, 5));
		productList.add(new Product(111, "Redmi", 14000.22, 4.4f, 15));
		productList.add(new Product(216, "Aquaguard Filter", 10000.22, 4.1f, 5));
		productList.add(new Product(109, "Panasonic TV", 13500.22, 3.3f, 7));
		productList.add(new Product(216, "Aquaguard Filter", 10000.22, 4.1f, 5));
		productList.add(new Product(176, "Dell Laptop", 90000.22, 4.3f, 8));
		
//		printProduct(productList);
		
		System.out.println("\nPrinting products using ArrayList containing duplicate values.\n");
		
		Iterator<Product> i=productList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println();
		
		Set<Product> myProduct = new LinkedHashSet<>(productList);
		
		System.out.println("\nPrinting products using LinkedHashSet without dupliacte values.\n");
		
		Iterator<Product> j=myProduct.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
	
	}	

//	public static void printProduct(Set<Product> productList) {
//		Iterator<Product> j=productList.iterator();
//		while(j.hasNext()) {
//			System.out.println(j.next());
//		}
//	}	

}
