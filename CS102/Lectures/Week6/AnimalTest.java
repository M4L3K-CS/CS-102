package CS102.Lectures.Week6;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Animal();
        animal[1] = new Cat("Garfield");
        animal[2] = new Dog("Snoopy");
        for (int i = 0; i < animal.length; i++) {
            System.out.println((animal[i]) + ((Cat)animal[1]).speak());
        }
    }
}
