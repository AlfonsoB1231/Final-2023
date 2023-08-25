public class Employee {
    private String name;
    private double monthlySalary;

    // Constructor
    public Employee(String name, double monthlySalary) {
        this.name = name;
        setMonthlySalary(monthlySalary);
    }

    // Mutator for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor for name
    public String getName() {
        return name;
    }

    // Mutator for monthlySalary
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Accessor for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public static void main(String[] args) {
        // Create Employee objects with different names
        Employee emp1 = new Employee("Alfon", 3000.0);
        Employee emp2 = new Employee("Fonso", 4000.0);
        Employee emp3 = new Employee("Bern", 2500.0);
        Employee emp4 = new Employee("John", 3500.0);

        // Display employee information
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Monthly Salary: " + emp1.getMonthlySalary());

        System.out.println("Employee Name: " + emp2.getName());
        System.out.println("Monthly Salary: " + emp2.getMonthlySalary());

        System.out.println("Employee Name: " + emp3.getName());
        System.out.println("Monthly Salary: " + emp3.getMonthlySalary());

        System.out.println("Employee Name: " + emp4.getName());
        System.out.println("Monthly Salary: " + emp4.getMonthlySalary());
    }
}
