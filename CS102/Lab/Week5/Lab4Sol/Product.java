package CS102.Lab.Week5.Lab4Sol;

public class Product {
	private double taxRate;
	private String name;
	private double price;

	public Product(){
		taxRate = 18;   // 18 %
		price = 1;      // 1 TL
	}

	public Product(double taxRate){
		this.taxRate = taxRate;
	}

	public Product(double taxRate, double price){
		this.taxRate = taxRate;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public String toString(){
		return "Name: " + name + "\n" +
				"Tax rate: " + taxRate + "\n" +
				"Price: " + price + "\n";
	}
}