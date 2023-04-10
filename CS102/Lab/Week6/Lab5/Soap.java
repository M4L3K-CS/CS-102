package CS102.Lab.Week6.Lab5;

public class Soap extends Cleaning{
    private int quantity;
    public Soap(String brand, int quantity) {
        super(brand);
        this.quantity = quantity;
    }
    
    public double calculateTotalPrice(){
        return this.getPrice() * this.getTaxRate() * quantity;
    }

}