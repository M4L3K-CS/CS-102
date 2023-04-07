package CS102.Lab.Week5.Lab4;

class Trousers extends Cloths {
    public Trousers(double taxRate, String brand, String color) {
        super(taxRate, color, brand);
        setType("Trousers");
    }

    public String toString() {
        return super.toString();
    }
}
