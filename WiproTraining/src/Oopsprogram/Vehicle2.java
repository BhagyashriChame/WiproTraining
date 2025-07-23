package Oopsprogram;
class Vehicle {
    public void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}
public class Vehicle2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start(); 
        c.move();  
    }
}
