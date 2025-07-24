package Day4;

abstract class Vehicle1 {
    abstract void speed();
    abstract void brand();
}

class Car extends Vehicle1 {
    void speed() {
        System.out.println("Speed of Car is : 120km/hr");
    }

    void brand() {
        System.out.println("Brand is : Audi");
    }
}

class Bike extends Vehicle1 {
    void speed() {
        System.out.println("Speed of Bike is : 80km/hr");
    }

    void brand() {
        System.out.println("Brand is : Yamaha");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle1 car = new Car();
        car.speed();
        car.brand();

        Vehicle1 bike = new Bike();
        bike.speed();
        bike.brand();
        
      
    }
}
