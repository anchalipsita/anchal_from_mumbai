package mypack;

public class Bill implements Comparable<Bill>{
	private String item;
	private int price;
	private int quantity;
	
	public Bill(String item, int price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void printDetails() {
		System.out.printf("%-14s %-13d %-12d %-14d\n",item,price,quantity,price*quantity);
	}
	
	
	@Override
	public int compareTo(Bill o) {
		String i1=this.item;
		String i2=o.item;
		return i1.compareTo(i2);
	}

}
