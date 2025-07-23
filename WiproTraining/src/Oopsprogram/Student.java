package Oopsprogram;

class Studenttest {
    String name;
    int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {
        Studenttest s = new Studenttest();
        s.name = "Shri";
        s.age = 20;
        s.display();
    }
}
