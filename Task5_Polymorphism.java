class Calculator {

    // Method with two int parameters
    int calculate(int a, int b) {
        return a + b;
    }

    // Method with two double parameters
    double calculate(double a, double b) {
        return a + b;
    }

    // Method with three int parameters
    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}


// Parent class
class Vehicle {

    void start() {
        System.out.println("Vehicle is starting.");
    }
}


// Child class
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}


// Child class
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}


public class Task5_Polymorphism {

    public static void main(String[] args) {

        // Method Overloading
        Calculator calculator = new Calculator();

        System.out.println("--- Method Overloading ---");

        System.out.println("Two integers: "
                + calculator.calculate(10, 20));

        System.out.println("Two double values: "
                + calculator.calculate(10.5, 20.5));

        System.out.println("Three integers: "
                + calculator.calculate(10, 20, 30));


        // Method Overriding
        System.out.println("\n--- Method Overriding ---");

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
    }
}