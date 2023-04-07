package CS102.Lab.Week6.Lab5;

class Food extends Product{
    private double kgs;
    private String expirationDate;
 public Food(double taxRate, double kgs, String name) {
        super(taxRate);
        this.kgs = kgs;
        expirationDate = "13.11.2018";
        setType("Food");
    }

    public Food(String name) {
        super(18, 1);
        expirationDate = "13.11.2018";
        setType(name);
    }

    public double getKgs() {
        return kgs;
    }

    public void setKgs(double kgs) {
        this.kgs = kgs;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String toString() {
        return super.toString() + "\nKgs : " + kgs + "\nExpiration date: " + expirationDate;
    }
}
