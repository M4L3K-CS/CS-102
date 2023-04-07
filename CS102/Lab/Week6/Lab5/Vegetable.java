package CS102.Lab.Week6.Lab5;

public class Vegetable extends Food {
    private boolean organic;

    public Vegetable(double taxRate, double kgs, boolean organic, String name) {
        super(taxRate, kgs, name);
        this.organic = organic;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIs organic: " + organic;
    }
}