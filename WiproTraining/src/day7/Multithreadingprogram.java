package day7;


public class Multithreadingprogram {
	class Mul1 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("This is Shri");
            }
        }
    }
    class Mul2 extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Multithreading concept");
            }
        }
    }  
    public static void main(String[] args) {
        Multithreadingprogram obj = new Multithreadingprogram();

        Mul1 m1 = obj.new Mul1(); 
        Mul2 m2 = obj.new Mul2(); 

        m1.start(); 
        m2.start(); 
    }
}
