package CS102.Lab.Week6.Lab5;

public class ProductTest {
      
    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Meat(0.1, 1.5, "Good");
        products[1] = new Trousers(0.2, "Blue", "Levis");
        products[2] = new Cleaning("Dettol");
        products[3] = new Dishwashing("Samsung");
        products[4] = new Dairy(0.1, 10, false, "Milk");
        products[5] = new Vegetable(0, 0, false, "Potato");
        products[6] = new Vegetable(0, 0, false, "Tomato");

        for (Product product : products) {
            System.out.println(product);

        }
        
    }
}
