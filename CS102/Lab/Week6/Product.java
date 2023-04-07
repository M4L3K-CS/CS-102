package CS102.Lab.Week6;

public class Product {
    protected static double taxRate;
    private String type;
    private double price;

    public double getTaxRate() {
        return taxRate;
    }
    public void setTaxRate(double taxRate) {
        Product.taxRate = taxRate;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
        taxRate = 0.18;
        price = 1;
    }

    public Product(double taxRate) {
        Product.taxRate = taxRate;
        price = 1;
    }

    public Product(double taxRate, double price) {
        Product.taxRate = taxRate;
        this.price = price;
    }

    public String toString() {
     return "Type: " + type + "\nTax rate: " + taxRate + "\nPrice: " + price;
    }
}