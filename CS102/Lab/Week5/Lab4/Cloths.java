package CS102.Lab.Week5.Lab4;

class Cloths extends Product {
    private String color;
    private String brand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Cloths(double taxRate, String brand, String color) {
        super(taxRate);
        this.brand = brand;
        this.color = color;
        setType("Cloths");
    }

    public String toString() {
        return " color " + color + ", brand " + brand;
    }
}