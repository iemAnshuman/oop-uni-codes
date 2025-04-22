class Vehicle {
    protected String brand;
    protected String model;
    protected double price;
    
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}

class Car extends Vehicle {
    protected int seatingCapacity;
    protected String fuelType;
    
    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Car");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class ElectricCar extends Car {
    private double batteryCapacity;
    private double chargingTime;
    
    public ElectricCar(String brand, String model, double price, int seatingCapacity, 
                      double batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, "Electric");
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Car Type: Electric Car");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

class Motorcycle extends Vehicle {
    private int engineCapacity;
    private String type;
    
    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Motorcycle Type: " + type);
    }
}

public class Exp56 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic", "Base Model", 15000.0);
        Car car = new Car("Toyota", "Camry", 25000.0, 5, "Petrol");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 45000.0, 5, 75.0, 8.0);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 12000.0, 600, "Sport");
        
        System.out.println("----- Vehicle Details -----");
        vehicle.displayDetails();
        
        System.out.println("\n----- Car Details -----");
        car.displayDetails();
        
        System.out.println("\n----- Electric Car Details -----");
        electricCar.displayDetails();
        
        System.out.println("\n----- Motorcycle Details -----");
        motorcycle.displayDetails();
        
        System.out.println("\n----- Inheritance Behavior -----");
        System.out.println("\nVehicle 1:");
        vehicle.displayDetails();
        System.out.println("\nVehicle 2:");
        car.displayDetails();
        System.out.println("\nVehicle 3:");
        electricCar.displayDetails();
        System.out.println("\nVehicle 4:");
        motorcycle.displayDetails();
    }
}
