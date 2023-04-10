package CS102.Lab.Week6.Lab5Sol;

public class Detergent extends Cleaning {
	private double lts;
	private boolean liquid;

	public Detergent(String brand, double lts, boolean liquid) {
		super(brand);
		this.lts = lts;
		this.liquid = liquid;
	}

	public Detergent(String brand){
		super(brand);
	}

	public void setLts(double lts){
		this.lts = lts;
	}

	public boolean isLiquid() {
		return liquid;
	}

	public void setLiquid(boolean liquid) {
		this.liquid = liquid;
	}

	public double getLts() {
		return lts;
	}

	public String toString(){
		return super.toString() +
				"Lts: " + lts + "\n" +
				"Liquid: " + liquid + "\n";
	}
	
	public double calculateTotalPrice () {
		return (getPrice() * (getTaxRate() + 100)/100) * lts;
	}

}
