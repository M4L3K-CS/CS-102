package CS102.Lab.Week6.Lab5;

public class Meat extends Food {
    private String quality;

    public Meat(double taxRate, double kgs, String quality) {
        super(taxRate, kgs, quality);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuality: " + quality;
    }
}
