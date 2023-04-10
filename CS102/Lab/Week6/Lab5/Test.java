package CS102.Lab.Week6.Lab5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();

		products.add(new Soap("A", 2));
		products.get(0).setPrice(10);

		Cloth sweaters = new Cloth(20, "darkGray", "A");
		sweaters.setTaxRate(18);
		sweaters.setName("sweaters");
		sweaters.setQuantity(2);
		products.add(sweaters);

		Trousers jean = new Trousers(30, "blue", "B");
		jean.setPrice(50.99);
		jean.setName("skinny jean");
		jean.setQuantity(0);
		products.add(jean);

		Dairy milk = new Dairy(25, 1, true, "milk");
		milk.setExpirationDate("09.11.2018");
		milk.setPrice(2.95);
		products.add(milk);

		Food pepper = new Food("pepper");
		products.add(pepper);

		DishWashing tablet = new DishWashing("C");
		tablet.setLts(30);
		tablet.setLiquid(false);
		tablet.setName("tablet");
		products.add(tablet);

		Vegetable lemon = new Vegetable(15, 1, true, "lemon");
		lemon.setExpirationDate("19.11.2018");
		lemon.setPrice(5.15);
		products.add(lemon);
		
		double total = 0;
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
		System.out.println("Total: " + total);
	}
}