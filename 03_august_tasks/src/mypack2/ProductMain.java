package mypack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();
		productList.add(new Product(106, "Samsung Galaxy", 22000.22, 4.3f, 4));
		productList.add(new Product(101, "Sony Headphones", 1100.22, 3.8f, 10));
		productList.add(new Product(109, "Panasonic TV", 13500.22, 3.3f, 7));
		productList.add(new Product(216, "Aquaguard Filter", 10000.22, 4.1f, 5));
		productList.add(new Product(176, "Dell Laptop", 90000.22, 4.3f, 8));
		productList.add(new Product(111, "Redmi", 14000.22, 4.4f, 15));

		printProductList(productList);

		Collections.sort(productList);

		System.out.println("\nPrinting Products sorted based on id using comparable");
		printProductList(productList);

		Collections.sort(productList, new ProductNameComparator());
		System.out.println("\nPrinting Products sorted based on product name(A-Z) using comparator");
		printProductList(productList);

		Collections.sort(productList, (Product p1, Product p2) -> {
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting Products sorted based on cost using lambda");
		printProductList(productList);
		
		Collections.sort(productList, (Product p1, Product p2) -> {
			Float f1=p1.getRating();
			Float f2=p2.getRating();
			int x=f2.compareTo(f1);
			if(x==0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x=d1.compareTo(d2);
			}
			return x;
		});
		
		System.out.println("\nPrinting Products sorted based on highest rating and if 2 or more have same rating then by lowest cost using lambda");
		printProductList(productList);
		
		Collections.sort(productList, (Product p1, Product p2) -> {
			Integer i1=p1.getQuantity();
			Integer i2=p2.getQuantity();
			int x=i2.compareTo(i1);
			if(x==0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x=d1.compareTo(d2);
			}
			return x;
		});

		System.out.println("\nPrinting Products sorted based on quantity available and if 2 or more have same quantity then by lowest cost using lambda");
		printProductList(productList);
	}

	public static void printProductList(List<Product> productList) {
		for (Product p : productList) {
			System.out.println(p);
		}
	}

}

