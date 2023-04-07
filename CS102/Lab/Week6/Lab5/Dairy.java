package CS102.Lab.Week6.Lab5;

public class Dairy extends Food {
    private boolean pasteurized;

    public Dairy(double taxRate, double kgs, boolean pasteurized, String name) {
        super(taxRate, kgs, name);
        this.pasteurized = pasteurized;
    }

    public boolean isPasteurized() {
        return pasteurized;
    }

    public void setPasteurized(boolean pasteurized) {
        this.pasteurized = pasteurized;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPasteurized: " + pasteurized;
    }
}
