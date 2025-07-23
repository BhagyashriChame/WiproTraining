package Oopsprogram;

public class SaleItem {
	private String productname;
	private int price;
	private double quantity;
	
	
	public SaleItem(String productname,int price,double quantity) {
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
		
	}
	public double getTotalPrice() {
		return price*quantity;
	}
	public void dispaly() {
	System.out.println("productname: "+productname);
	System.out.println("productPrice: "+price);
System.out.println("productquantity :"+quantity);
	}


}

