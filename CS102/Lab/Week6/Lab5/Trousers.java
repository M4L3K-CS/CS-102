package CS102.Lab.Week6.Lab5;

class Trousers extends Cloths {
    public Trousers(double taxRate, String brand, String color) {
        super(taxRate, color, brand);
        setType("Trousers");
    }

    public String toString() {
        return super.toString();
    }
}
