package CS102.Lab.Week6.Lab5;

public class Trousers extends Cloth {
	public Trousers(double taxRate, String color, String brand) {
		super(taxRate, color, brand);
	}

	// We don't need to overwrite the toString() method since 
	// there is no additional information to print out.
}