package CS102.Lab.Week6.Lab5Sol;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Skirt(5, "M&S", "red", 20, "skirt"));
		products.get(0).setPrice(40);
		
		Food pepper = new Food("pepper");
		pepper.setKgs(10);
		products.add(pepper);
	    
		DishWashing tablet = new DishWashing("C");
		tablet.setLts(30);
		tablet.setPrice(25);
		tablet.setLiquid(false);
		tablet.setName("tablet");
		products.add(tablet);
	    
		Trousers jean = new Trousers(30, "blue", "B");
		jean.setName("jean");
		jean.setPrice(50.99);
		jean.setQuantity(10);
		products.add(jean);
		
		Dairy milk = new Dairy(25, 1, true, "milk");
		milk.setExpirationDate("09.12.2018");
		milk.setPrice(2.95);
		products.add(milk);
		
		double total = 0;
		
		// Fill out the rest
		
		System.out.println("Purchased Cloth Items\n");
		for (Product product: products) {
			if (product instanceof Cloth) {
				System.out.println(product);
				total += ((Cloth) product).calculateTotalPrice();
			}
		}
		System.out.println("-------------------------------");
		System.out.println("Purchased Detergent Items\n");
		for (Product product: products) {
			if (product instanceof Detergent) {
				System.out.println(product);
				total += ((Detergent) product).calculateTotalPrice();
			}
		}
		System.out.println("-------------------------------");
		System.out.println("Purchased Food Items\n");
		for (Product product: products) {
			if (product instanceof Food) {
				System.out.println(product);
				total += ((Food) product).calculateTotalPrice();
			}
		}
		System.out.println("-------------------------------");
		System.out.println("Total is " + total);	

	}

}
