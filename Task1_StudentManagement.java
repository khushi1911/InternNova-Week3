class Student {

    String name;
    int rollNumber;
    String branch;
    double cgpa;

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
}

public class Task1_StudentManagement {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Khushi";
        student1.rollNumber = 101;
        student1.branch = "CSE - Data Science";
        student1.cgpa = 9.2;

        Student student2 = new Student();
        student2.name = "Ananya";
        student2.rollNumber = 102;
        student2.branch = "CSE";
        student2.cgpa = 8.8;

        Student student3 = new Student();
        student3.name = "Rahul";
        student3.rollNumber = 103;
        student3.branch = "ISE";
        student3.cgpa = 8.5;

        System.out.println("--- Student 1 ---");
        student1.displayStudent();

        System.out.println("--- Student 2 ---");
        student2.displayStudent();

        System.out.println("--- Student 3 ---");
        student3.displayStudent();
    }
}