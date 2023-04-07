package CS102.Lab.Week5.Lab4;

class Skirt extends Cloths {
    private int quantity;

    public Skirt(double taxRate, int quantity, String color, String brand) {
        super(taxRate, brand, color);
        this.quantity = quantity;
        setType("Skirt");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return super.toString() + "\nQuantity: " + quantity;
    }
}