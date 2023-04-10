package CS102.Lab.Week2.Lab1;

public class CarTest {
    public static void main(String[] args) {
        Car carA = new Car("BMW", "Black");
        Car carB = new Car("Mercedes", "Grey");
        Car carC = new Car("Audi", "White");

        carA.Drive(3, 65);
        carA.incrementGear();
        carA.Display();

        carB.Drive(4, 15);
        carB.incrementGear();
        carB.Display();

        carC.Drive(2, 125);
        carC.incrementGear();
        carC.Display();
    }

}
