package CS102.Lab.Week6.Lab5;

public class Detergent extends Cleaning {
    private double lts;
    private boolean liquid;

    public Detergent(String brand, double lts, boolean liquid) {
        super(brand);
        this.lts = lts;
        this.liquid = liquid;
    }

    public double getLts() {
        return lts;
    }

    public void setLts(double lts) {
        this.lts = lts;
    }

    public boolean isLiquid() {
        return liquid;
    }

    public void setLiquid(boolean liquid) {
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLts: " + lts + "\nLiquid: " + liquid;
    }
}
