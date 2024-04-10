// Encapsulation
class Car {
    private String model;
    private int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getter and Setter methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// Inheritance
class ElectricCar extends Car {
    private int batteryLife;

    // Constructor
    public ElectricCar(String model, int year, int batteryLife) {
        super(model, year);
        this.batteryLife = batteryLife;
    }

    // Getter and Setter method for batteryLife
    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}

// Polymorphism
interface Engine {
    void start();
}

class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gasoline engine started.");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started.");
    }
}

// Abstraction
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        // Encapsulation
        Car myCar = new Car("Toyota", 2020);
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Inheritance
        ElectricCar myElectricCar = new ElectricCar("Tesla", 2021, 300);
        System.out.println("Model: " + myElectricCar.getModel());
        System.out.println("Year: " + myElectricCar.getYear());
        System.out.println("Battery Life: " + myElectricCar.getBatteryLife());

        // Polymorphism
        Engine gasolineEngine = new GasolineEngine();
        gasolineEngine.start();

        Engine electricEngine = new ElectricEngine();
        electricEngine.start();

        // Abstraction
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());
    }
}