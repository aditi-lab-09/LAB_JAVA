class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    // Constructor
    MotorVehicle(String name, int number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }

    // Display method
    void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
    }
}

// Subclass
class Car extends MotorVehicle {
    double discountRate;

    // Constructor
    Car(String name, int number, double price, double rate) {
        super(name, number, price);
        discountRate = rate;
    }

    // Override display
    void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
    }

    // Discount method
    void discount() {
        double discountAmount = (modelPrice * discountRate) / 100;
        double finalPrice = modelPrice - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price after discount: " + finalPrice);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car c = new Car("Tesla", 101, 5000000, 10);

        c.display();
        c.discount();
    }
}