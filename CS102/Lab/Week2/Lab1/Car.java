package CS102.Lab.Week2.Lab1;

public class Car {
    private String model;
    private String color;
    private int gear;
    private int odometer;

    public Car(String Model, String Color) {
        model = Model;
        color = Color;
    }

    public Car(int g, int odometer) {
        gear = 0;
        odometer = 0;
    }

    public void incrementGear() {
        gear +=1;
    }
    public void decrementGear() {
        gear -=1;
    }

    public void Drive(double hours, double kmph) {
        odometer += hours * kmph;
    }

    public String getColor() {
        return color;
    }

    public String setColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String setModel() {
        return model;
    }

    public int getGear() {
        return gear;
    }

    public int setGear() {
        return gear;
    }

    public double getOdometer() {
        return odometer;
    }

    public double setOdometer() {
        return odometer;
    }
    public void Display() {
        System.out.println("Model:" + model);
        System.out.println("Color:" + color);
        System.out.println("Gear:" + gear);
        System.out.println("Odometer:" + odometer);
    }

}
