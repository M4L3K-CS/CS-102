package CS102.Lab.Week1.Object;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee mehmet = new Employee("Mehmet", 28, 1, 145000);
        Employee aydan = new Employee("Aydan", 18, 2, 90000);
        System.out.println("The employee " + mehmet.name + " is " + mehmet.age + " years old. " + "His designation is "
                + mehmet.designation + " and he earns a salary of " + mehmet.salary + " USD yearly.");
        System.out.println("The employee " + aydan.name + " is " + aydan.age + " years old. " + "His designation is "
                + aydan.designation + " and he earns a salary of " + aydan.salary + " USD yearly.");
    }
}
