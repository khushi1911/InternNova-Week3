class Employee {

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

// Developer inherits Employee
class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int employeeId, double salary,
              String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Manager inherits Employee
class Manager extends Employee {

    int teamSize;

    Manager(String name, int employeeId, double salary, int teamSize) {

        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Team Size: " + teamSize);
    }
}

public class Task4_EmployeeInheritance {

    public static void main(String[] args) {

        Developer developer =
                new Developer("Khushi", 101, 60000, "Java");

        Manager manager =
                new Manager("Ananya", 102, 75000, 8);

        System.out.println("--- Developer Details ---");
        developer.displayDeveloper();

        System.out.println();

        System.out.println("--- Manager Details ---");
        manager.displayManager();
    }
}