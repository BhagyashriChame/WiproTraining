package Oopsprogram;
class Polymorphism1 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Polymorphism1 {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Polymorphism1 {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Polymorphism1 s1 = new Circle();      
        Polymorphism1 s2 = new Rectangle(); 

        s1.draw();  
        s2.draw();  
    }
}
