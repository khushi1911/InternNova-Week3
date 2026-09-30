class Employee {

    int employeeId;
    String employeeName;
    String department;
    double salary;

    // Default constructor
    Employee() {
        employeeId = 0;
        employeeName = "Not Assigned";
        department = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(int employeeId, String employeeName, String department, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Task2_EmployeeConstructors {

    public static void main(String[] args) {

        // Object using default constructor
        Employee employee1 = new Employee();

        // Object using parameterized constructor
        Employee employee2 = new Employee(
                102,
                "Khushi",
                "Development",
                50000
        );

        System.out.println("--- Employee 1: Default Constructor ---");
        employee1.displayEmployee();

        System.out.println("--- Employee 2: Parameterized Constructor ---");
        employee2.displayEmployee();
    }
}