package Oopsprogram;

public class SaleItem2 {
	public static void main(String[] args) {
		SaleItem[] items= {new SaleItem("laptop",50000,1),
				new SaleItem("pen",10,2)};
		double grandTotal=0;
		System.out.println("productname\tprice\tquantity");
		for(SaleItem item:items) {
			item.dispaly();
			grandTotal=grandTotal+item.getTotalPrice();
			System.out.println(grandTotal);
		}
	}
	}
