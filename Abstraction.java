// Abstract class
abstract class Car {
    String brand = "BMW";

    abstract void startEngine();
    abstract void stopEngine();

    void showBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

// Subclass BMW M5 Sedan
class BMWm5Sedan extends Car {

    @Override
    void startEngine() {
        System.out.println("BMW M5 Sedan engine started using push button.");
    }

    @Override
    void stopEngine() {
        System.out.println("BMW M5 Sedan engine stopped when you stepped on the break pedal.");
    }

    void showModel() {
        System.out.println("Model: BMW M5 Sedan 2013");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new BMWm5Sedan();   // Abstraction + Polymorphism

        myCar.showBrand();
        myCar.startEngine();
        myCar.stopEngine();

        // To access showModel(), cast to BMWm5Sedan
        ((BMWm5Sedan) myCar).showModel();
    }
}
